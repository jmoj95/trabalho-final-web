package br.ufc.quixada.trabalhofinalweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.quixada.trabalhofinalweb.model.Cliente;
import br.ufc.quixada.trabalhofinalweb.repository.ClienteRepository;

@Service
public class ClienteService {

        @Autowired
        private ClienteRepository repository;

        public Cliente adicionar(Cliente cliente) {
                return repository.save(cliente);
        }

        public Cliente listarPorId(Long id) {
                return repository.getOne(id);
        }

}