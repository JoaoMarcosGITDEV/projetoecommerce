package org.example.projetoecommerce.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
public class Pessoa extends BaseModel {

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;

    public List<Contato> contatos;
}
