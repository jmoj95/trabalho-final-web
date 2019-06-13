package br.ufc.quixada.trabalhofinalweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.quixada.trabalhofinalweb.model.Pedido;
import br.ufc.quixada.trabalhofinalweb.repository.PedidoRepository;

@Service
public class PedidoService {

        @Autowired
        private PedidoRepository repository;

        public Pedido adicionar(Pedido pedido) {
                return repository.save(pedido);
        }

        public List<Pedido> listarTodos() {
                return repository.findAll();
        }

}