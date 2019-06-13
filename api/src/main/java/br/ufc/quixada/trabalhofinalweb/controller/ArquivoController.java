package br.ufc.quixada.trabalhofinalweb.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.ufc.quixada.trabalhofinalweb.model.Arquivo;
import br.ufc.quixada.trabalhofinalweb.payload.RespostaUploadArquivo;
import br.ufc.quixada.trabalhofinalweb.service.ArquivoService;

@RestController
@RequestMapping("/arquivos")
public class ArquivoController {

        @Autowired
        private ArquivoService service;
    
        @PostMapping("/upload")
        public RespostaUploadArquivo upload(@RequestParam MultipartFile arquivo) {
            Arquivo novoArquivo = service.salvar(arquivo);
    
            String downloadUriArquivo = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/download/")
                    .path(novoArquivo.getId())
                    .toUriString();
    
            return new RespostaUploadArquivo(novoArquivo.getNome(), downloadUriArquivo,
                    arquivo.getContentType(), arquivo.getSize());
        }
    
        @PostMapping("/upload/multiple")
        public List<RespostaUploadArquivo> uploadMultiplos(@RequestParam MultipartFile[] arquivos) {
            return Arrays.asList(arquivos)
                    .stream()
                    .map(arquivo -> upload(arquivo))
                    .collect(Collectors.toList());
        }
    
        @GetMapping("/download/{id}")
        public ResponseEntity<Resource> download(@PathVariable String id) {
                Arquivo arquivo = service.recuperar(id);
    
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(arquivo.getTipo()))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + arquivo.getNome() + "\"")
                    .body(new ByteArrayResource(arquivo.getDados()));
        }
}