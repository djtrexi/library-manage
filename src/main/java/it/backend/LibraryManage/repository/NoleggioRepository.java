package it.backend.LibraryManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.backend.LibraryManage.model.Noleggio;

@Repository
public interface NoleggioRepository extends JpaRepository<Noleggio, Long>{}
