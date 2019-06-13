package br.ufc.quixada.trabalhofinalweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufc.quixada.trabalhofinalweb.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}