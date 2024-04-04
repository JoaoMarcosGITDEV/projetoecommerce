package org.example.projetoecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "CONTATO")
public class Contato extends BaseModel {
    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;


    private Pessoa pessoa;


    private List<Email> emails;


    private List<Endereco> enderecos;


    private List<Telefone> telefones;

}
