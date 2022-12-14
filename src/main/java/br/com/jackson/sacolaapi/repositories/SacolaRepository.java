package br.com.jackson.sacolaapi.repositories;

import br.com.jackson.sacolaapi.models.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SacolaRepository extends JpaRepository<Sacola, Long> {
}
