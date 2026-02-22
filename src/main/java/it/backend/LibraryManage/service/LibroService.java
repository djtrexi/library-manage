package it.backend.LibraryManage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.backend.LibraryManage.model.Libro;
import it.backend.LibraryManage.repository.LibroRepository;

@Service
public class LibroService {
	@Autowired
	private LibroRepository libroRepository;
}
