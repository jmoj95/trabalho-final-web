package br.ufc.quixada.trabalhofinalweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import br.ufc.quixada.trabalhofinalweb.exception.ArquivoException;
import br.ufc.quixada.trabalhofinalweb.exception.ArquivoNaoEncontradoException;
import br.ufc.quixada.trabalhofinalweb.model.Arquivo;
import br.ufc.quixada.trabalhofinalweb.repository.ArquivoRepository;

@Service
public class ArquivoService {

        @Autowired
        private ArquivoRepository repository;

        public Arquivo salvar(MultipartFile arquivo) {
                String nomeArquivo = StringUtils.cleanPath(arquivo.getOriginalFilename());
                try {
                        if (nomeArquivo.contains("..")) {
                                throw new ArquivoException("Sequencia invalida: " + nomeArquivo);
                        }
                        Arquivo novo = new Arquivo(nomeArquivo, arquivo.getContentType(), arquivo.getBytes());
                        return repository.save(novo);
                } catch (Exception e) {
                        throw new ArquivoException("Falha ao armazenar arquivo " + nomeArquivo + ". Tente novamente.", e);
                }
        }

        public Arquivo recuperar(String id) {
                return repository.findById(id)
                        .orElseThrow(() -> new ArquivoNaoEncontradoException("Arquivo com ID=" + id + " nao encontrado."));
        }

}