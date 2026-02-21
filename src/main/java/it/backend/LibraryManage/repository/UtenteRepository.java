package it.backend.LibraryManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.backend.LibraryManage.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	@Query("SELECT u FROM Utente u WHERE u.email = ?1 and u.password = ?2")
	public Utente login(String email, String password);
}
