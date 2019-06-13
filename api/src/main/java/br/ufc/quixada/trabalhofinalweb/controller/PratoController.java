package br.ufc.quixada.trabalhofinalweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.quixada.trabalhofinalweb.model.Prato;
import br.ufc.quixada.trabalhofinalweb.service.PratoService;

@RestController
@RequestMapping("/pratos")
public class PratoController {

        @Autowired
        private PratoService service;

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Prato adicionar(@RequestBody Prato prato) {
                return service.adicionar(prato);
        }

        @DeleteMapping("{id}")
        @ResponseStatus(HttpStatus.OK)
        public void removerPorId(@PathVariable Long id) {
                service.removerPorId(id);
        }

        @GetMapping
        public List<Prato> listarTodos() {
                return service.listarTodos();
        }

        @GetMapping("{id}")
        public Prato listarPorId(@PathVariable Long id) {
                return service.listarPorId(id);
        }

}