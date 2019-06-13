package br.ufc.quixada.trabalhofinalweb.payload;

public class RespostaUploadArquivo {

        private String nomeArquivo;
        private String downloadUriArquivo;
        private String tipoArquivo;
        private Long tamanhoArquivo;

        public RespostaUploadArquivo(String nomeArquivo, String downloadUriArquivo, String tipoArquivo, Long tamanhoArquivo) {
                this.nomeArquivo = nomeArquivo;
                this.downloadUriArquivo = downloadUriArquivo;
                this.tipoArquivo = tipoArquivo;
                this.tamanhoArquivo = tamanhoArquivo;
        }

        /**
         * @return the nomeArquivo
         */
        public String getNomeArquivo() {
                return nomeArquivo;
        }

        /**
         * @param nomeArquivo the nomeArquivo to set
         */
        public void setNomeArquivo(String nomeArquivo) {
                this.nomeArquivo = nomeArquivo;
        }

        /**
         * @return the downloadUriArquivo
         */
        public String getDownloadUriArquivo() {
                return downloadUriArquivo;
        }

        /**
         * @param downloadUriArquivo the downloadUriArquivo to set
         */
        public void setDownloadUriArquivo(String downloadUriArquivo) {
                this.downloadUriArquivo = downloadUriArquivo;
        }

        /**
         * @return the tipoArquivo
         */
        public String getTipoArquivo() {
                return tipoArquivo;
        }

        /**
         * @param tipoArquivo the tipoArquivo to set
         */
        public void setTipoArquivo(String tipoArquivo) {
                this.tipoArquivo = tipoArquivo;
        }

        /**
         * @return the tamanhoArquivo
         */
        public Long getTamanhoArquivo() {
                return tamanhoArquivo;
        }

        /**
         * @param tamanhoArquivo the tamanhoArquivo to set
         */
        public void setTamanhoArquivo(Long tamanhoArquivo) {
                this.tamanhoArquivo = tamanhoArquivo;
        }

}