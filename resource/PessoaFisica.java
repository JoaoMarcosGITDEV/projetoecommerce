package org.example.projetoecommerce.resource;

import org.example.projetoecommerce.interfaces.IResource;

import java.util.List;

public class PessoaFisica implements IResource<PessoaFisica, Integer> {
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
