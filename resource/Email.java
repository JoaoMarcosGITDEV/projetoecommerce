package org.example.projetoecommerce.resource;

import org.example.projetoecommerce.interfaces.IResource;

import java.util.List;

public class Email implements IResource<Email, Integer> {
    @Override
    public Email create(Email entity) {
        return null;
    }

    @Override
    public List<Email> read() {
        return null;
    }

    @Override
    public Email read(Integer id) {
        return null;
    }

    @Override
    public Email update(Integer id, Email entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
