package br.com.jackson.sacolaapi.repositories;

import br.com.jackson.sacolaapi.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
