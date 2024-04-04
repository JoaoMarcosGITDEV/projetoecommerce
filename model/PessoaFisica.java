package org.example.projetoecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PESSOA_FISICA")
public class PessoaFisica extends BaseModel {
    @Column(name = "CPF", length = 11,nullable = false)// Nomear coluna
    private String cpf;
}
