package it.backend.LibraryManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.backend.LibraryManage.model.Utente;
import it.backend.LibraryManage.request.utente.UtenteGetFilterListUserRequest;
import it.backend.LibraryManage.request.utente.UtenteModifyUtenteRequest;
import it.backend.LibraryManage.request.utente.UtenteSignUpRequest;
import it.backend.LibraryManage.response.utente.UtenteGetFilterListUserResponse;
import it.backend.LibraryManage.response.utente.UtenteLoginUserResponse;
import it.backend.LibraryManage.service.UtenteService;

@RestController
@RequestMapping("/api/v1/utente")
public class UtenteController {
	@Autowired
	private UtenteService utenteService;

	@PostMapping("/utenteSignUp")
	public ResponseEntity utenteSignUp(@RequestBody UtenteSignUpRequest utenteSignUpRequest) {
		if (utenteSignUpRequest.isValid()) {
			Utente utente = new Utente(utenteSignUpRequest.getNome(), utenteSignUpRequest.getCognome(), utenteSignUpRequest.getIndirizzo(), utenteSignUpRequest.getEmail());
			if (utenteService.inserUser(utente)) {
				return ResponseEntity.status(HttpStatus.CREATED).build();
			}
			else {
				return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).build();
			}
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<UtenteLoginUserResponse> loginUser(@PathVariable Long id) {
		if (id <= 0) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		else {
			Utente utente = utenteService.login(id);
			if (utente == null) {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
			}
			return ResponseEntity.status(HttpStatus.OK).body(new UtenteLoginUserResponse(utente));
		}
	}
	
	@PutMapping("/modifyUser/{id}")
	public ResponseEntity modifyUtente(@PathVariable Long id, @RequestBody UtenteModifyUtenteRequest utenteModifyUtenteRequest) {
		if (id <= 0 || !utenteModifyUtenteRequest.isValid()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		else {
			Utente utenteJson = new Utente(utenteModifyUtenteRequest.getNome(), utenteModifyUtenteRequest.getCognome(), utenteModifyUtenteRequest.getIndirizzo(), utenteModifyUtenteRequest.getEmail());
			if(utenteService.modifyUtente(id, utenteJson)) {
				return ResponseEntity.status(HttpStatus.OK).build();
			}
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity deleteUtente(@PathVariable Long id) {
		if(id <= 0) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		else {
			if (utenteService.deleteUtente(id)) {
				return ResponseEntity.status(HttpStatus.OK).build();
			}
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}
	
	@GetMapping("/getFilterNameSurname")
	public ResponseEntity<UtenteGetFilterListUserResponse> getFilterListUser(@RequestBody UtenteGetFilterListUserRequest utenteGetFilterListUserRequest) {
		if (!utenteGetFilterListUserRequest.isValid()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		else {
			List<Utente> listUtentes = utenteService.getFilterListUser(utenteGetFilterListUserRequest.getNome(), utenteGetFilterListUserRequest.getCognome());
			if (listUtentes == null) {
				return ResponseEntity.status(HttpStatus.CONFLICT).build();
			}
			return ResponseEntity.status(HttpStatus.OK).body(new UtenteGetFilterListUserResponse(listUtentes));
		}
	}
}
