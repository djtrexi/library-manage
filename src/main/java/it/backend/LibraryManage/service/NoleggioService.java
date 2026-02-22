package it.backend.LibraryManage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.backend.LibraryManage.repository.NoleggioRepository;

@Service
public class NoleggioService {
	@Autowired
	private NoleggioRepository noleggioRepository;
}
