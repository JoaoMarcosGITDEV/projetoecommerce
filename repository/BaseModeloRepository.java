package org.example.projetoecommerce.repository;

import org.example.projetoecommerce.model.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseModeloRepository extends JpaRepository<BaseModel, Integer> {
}
