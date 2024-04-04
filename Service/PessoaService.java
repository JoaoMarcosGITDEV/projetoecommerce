package org.example.projetoecommerce.Service;

import org.example.projetoecommerce.interfaces.IService;
import org.example.projetoecommerce.model.BaseModel;
import org.example.projetoecommerce.model.Pessoa;

import java.util.List;

public class PessoaService implements IService<Pessoa, Integer> {

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
