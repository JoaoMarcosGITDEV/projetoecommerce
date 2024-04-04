package org.example.projetoecommerce.Service;

import org.example.projetoecommerce.interfaces.IService;
import org.example.projetoecommerce.model.BaseModel;
import org.example.projetoecommerce.model.PessoaFisica;

import java.util.List;

public class PessoaFisicaService implements IService<PessoaFisica, Integer> {

    @Override
    public PessoaFisica create(PessoaFisica entity) {
        return null;
    }

    @Override
    public List<PessoaFisica> read() {
        return null;
    }

    @Override
    public PessoaFisica read(Integer id) {
        return null;
    }

    @Override
    public PessoaFisica update(Integer id, PessoaFisica entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}

