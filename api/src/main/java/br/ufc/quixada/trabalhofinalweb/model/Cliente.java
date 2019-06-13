package br.ufc.quixada.trabalhofinalweb.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private String cpf;
        private Calendar dataNascimento;
        private String endereco;
        private String senha;
        private String email;
        @OneToMany(mappedBy = "cliente")
        private List<Pedido> pedidos;

        public Cliente() {

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
         * @return the cpf
         */
        public String getCpf() {
                return cpf;
        }
        /**
         * @param cpf the cpf to set
         */
        public void setCpf(String cpf) {
                this.cpf = cpf;
        }
        /**
         * @return the dataNascimento
         */
        public Calendar getDataNascimento() {
                return dataNascimento;
        }

        /**
         * @param dataNascimento the dataNascimento to set
         */
        public void setDataNascimento(Calendar dataNascimento) {
                this.dataNascimento = dataNascimento;
        }

        /**
         * @return the endereco
         */
        public String getEndereco() {
                return endereco;
        }

        /**
         * @param endereco the endereco to set
         */
        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        /**
         * @return the senha
         */
        public String getSenha() {
                return senha;
        }

        /**
         * @param senha the senha to set
         */
        public void setSenha(String senha) {
                this.senha = senha;
        }

        /**
         * @return the email
         */
        public String getEmail() {
                return email;
        }

        /**
         * @param email the email to set
         */
        public void setEmail(String email) {
                this.email = email;
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

}