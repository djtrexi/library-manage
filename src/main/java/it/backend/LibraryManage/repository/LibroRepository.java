package it.backend.LibraryManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.backend.LibraryManage.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{}
