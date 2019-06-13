package br.ufc.quixada.trabalhofinalweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.quixada.trabalhofinalweb.model.Prato;
import br.ufc.quixada.trabalhofinalweb.repository.PratoRepository;

@Service
public class PratoService {

        @Autowired
        private PratoRepository repository;

        public Prato adicionar(Prato prato) {
                return repository.save(prato);
        }

        public void removerPorId(Long id) {
                repository.deleteById(id);
        }

        public List<Prato> listarTodos() {
                return repository.findAll();
        }

        public Prato listarPorId(Long id) {
                return repository.findById(id).get();
        }

}