package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    @Query(value = "SELECT c FROM Cliente c where c.nome like ?1")
    List<Cliente> findByNome(String nome);
}