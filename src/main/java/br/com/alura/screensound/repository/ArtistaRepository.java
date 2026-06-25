package br.com.alura.screensound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.screensound.model.Artista;

import java.util.Optional;


public interface ArtistaRepository extends JpaRepository<Artista, Long> {
    Optional<Artista> findByNomeContainingIgnoreCase(String nome);
}
