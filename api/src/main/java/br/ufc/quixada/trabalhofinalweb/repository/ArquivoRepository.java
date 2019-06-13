package br.ufc.quixada.trabalhofinalweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufc.quixada.trabalhofinalweb.model.Arquivo;

@Repository
public interface ArquivoRepository extends JpaRepository<Arquivo, String> {

}