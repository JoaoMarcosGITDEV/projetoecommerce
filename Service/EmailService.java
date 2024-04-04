package org.example.projetoecommerce.Service;

import org.example.projetoecommerce.interfaces.IService;
import org.example.projetoecommerce.model.BaseModel;
import org.example.projetoecommerce.model.Email;

import java.util.List;

public class EmailService implements IService<Email, Integer> {

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
