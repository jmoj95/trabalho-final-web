package br.ufc.quixada.trabalhofinalweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ArquivoNaoEncontradoException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public ArquivoNaoEncontradoException(String mensagem) {
                super(mensagem);
        }

        public ArquivoNaoEncontradoException(String mensagem, Throwable causa) {
                super(mensagem, causa);
        }

}