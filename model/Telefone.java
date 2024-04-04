package org.example.projetoecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Telefone extends BaseModel{


        @Column(name = "DDD", nullable = false)
        private String ddd;

        @Column(name = "NUMERO", nullable = false)
        private String numero;

        @Column(name = "DATA_INICIO", nullable = false)
        private LocalDateTime dataInicio;

        @Column(name = "DATA_FIM")
        private LocalDateTime dataFim;

        private Contato contato;
}
