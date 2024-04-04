package org.example.projetoecommerce.resource;

import org.example.projetoecommerce.interfaces.IResource;

import java.util.List;

public class Pessoa implements IResource<Pessoa, Integer> {
    @Override
    public Pessoa create(Pessoa entity) {
        return null;
    }

    @Override
    public List<Pessoa> read() {
        return null;
    }

    @Override
    public Pessoa read(Integer id) {
        return null;
    }

    @Override
    public Pessoa update(Integer id, Pessoa entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
