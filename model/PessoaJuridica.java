package org.example.projetoecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PESSOA_JURIDICA")
public class PessoaJuridica extends BaseModel {
    @Column(name = "CNPJ", length = 14,nullable = false)// Nomear coluna
    private String cnpj;
}
