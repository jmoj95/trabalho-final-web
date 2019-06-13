package br.ufc.quixada.trabalhofinalweb.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Prato {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private String nome;
        private Float preco;
        @OneToOne
        private Arquivo imagem;
        @ManyToMany(mappedBy = "pratos")
        private List<Pedido> pedidos;

        public Prato() {

        }

        /**
         * @return the id
         */
        public Long getId() {
                return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(Long id) {
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
         * @return the preco
         */
        public Float getPreco() {
                return preco;
        }

        /**
         * @param preco the preco to set
         */
        public void setPreco(Float preco) {
                this.preco = preco;
        }

        /**
         * @return the pedidos
         */
        public List<Pedido> getPedidos() {
                return pedidos;
        }

        /**
         * @param pedidos the pedidos to set
         */
        public void setPedidos(List<Pedido> pedidos) {
                this.pedidos = pedidos;
        }

        /**
         * @return the imagem
         */
        public Arquivo getImagem() {
                return imagem;
        }

        /**
         * @param imagem the imagem to set
         */
        public void setImagem(Arquivo imagem) {
                this.imagem = imagem;
        }

}