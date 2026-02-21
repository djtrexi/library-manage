package it.backend.LibraryManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.backend.LibraryManage.model.Abbonamento;

@Repository
public interface AbbonamentoRepository extends JpaRepository<Abbonamento, Long>{}
