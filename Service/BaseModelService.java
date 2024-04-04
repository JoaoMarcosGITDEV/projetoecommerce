package org.example.projetoecommerce.Service;

import org.example.projetoecommerce.interfaces.IService;
import org.example.projetoecommerce.model.BaseModel;

import java.util.List;

public class BaseModelService implements IService<BaseModel, Integer> {
    @Override
    public BaseModel create(BaseModel entity) {
        return null;
    }

    @Override
    public List<BaseModel> read() {
        return null;
    }

    @Override
    public BaseModel read(Integer id) {
        return null;
    }

    @Override
    public BaseModel update(Integer id, BaseModel entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
