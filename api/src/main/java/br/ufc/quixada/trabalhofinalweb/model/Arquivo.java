package br.ufc.quixada.trabalhofinalweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Arquivo {

        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "uuid2")
        private String id;
        private String nome;
        private String tipo;
        @Lob
        private byte[] dados;
        @OneToOne
        private Prato prato;

        public Arquivo() {

        }

        public Arquivo(String nome, String tipo, byte[] dados) {
                this.nome = nome;
                this.tipo = tipo;
                this.dados = dados;
        }

        /**
         * @return the id
         */
        public String getId() {
                return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(String id) {
                this.id = id;
        }

        /**
         * @return the nome
         */
        public String getNome() {
                return nome;
        }

        /**
         * @param nome the nome to set
         */
        public void setNome(String nome) {
                this.nome = nome;
        }

        /**
         * @return the tipo
         */
        public String getTipo() {
                return tipo;
        }

        /**
         * @param tipo the tipo to set
         */
        public void setTipo(String tipo) {
                this.tipo = tipo;
        }

        /**
         * @return the dados
         */
        public byte[] getDados() {
                return dados;
        }

        /**
         * @param dados the dados to set
         */
        public void setDados(byte[] dados) {
                this.dados = dados;
        }

        /**
         * @return the prato
         */
        public Prato getPrato() {
                return prato;
        }

        /**
         * @param prato the prato to set
         */
        public void setPrato(Prato prato) {
                this.prato = prato;
        }

}