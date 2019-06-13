package br.ufc.quixada.trabalhofinalweb.exception;

public class ArquivoException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public ArquivoException(String mensagem) {
                super(mensagem);
        }

        public ArquivoException(String mensagem, Throwable causa) {
                super(mensagem, causa);
        }

}