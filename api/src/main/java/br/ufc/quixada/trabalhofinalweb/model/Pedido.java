package br.ufc.quixada.trabalhofinalweb.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private Calendar data;
        @ManyToOne
        private Cliente cliente;
        @ManyToMany(cascade = {CascadeType.ALL})
        @JoinTable(
                name = "pedido_prato",
                joinColumns = {@JoinColumn(name = "pedido_id")},
                inverseJoinColumns = {@JoinColumn(name = "prato_id")}
        )
        private List<Prato> pratos;

        public Pedido() {

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
         * @return the data
         */
        public Calendar getData() {
                return data;
        }

        /**
         * @param data the data to set
         */
        public void setData(Calendar data) {
                this.data = data;
        }

        /**
         * @return the cliente
         */
        public Cliente getCliente() {
                return cliente;
        }

        /**
         * @param cliente the cliente to set
         */
        public void setCliente(Cliente cliente) {
                this.cliente = cliente;
        }

        /**
         * @return the pratos
         */
        public List<Prato> getPratos() {
                return pratos;
        }

        /**
         * @param pratos the pratos to set
         */
        public void setPratos(List<Prato> pratos) {
                this.pratos = pratos;
        }

}