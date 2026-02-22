package it.backend.LibraryManage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.backend.LibraryManage.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	@Query("SELECT u FROM Utente u WHERE u.email = ?1")
	public Utente getUserByEmail(String email);
	
	@Query("SELECT u FROM Utente u WHERE u.nome = ?1")
	public List<Utente> getListUserByName(String nome);
	
	@Query("SELECT u FROM Utente u WHERE u.cognome = ?1")
	public List<Utente> getListUserBySurname(String congome);
}
