package org.example.projetoecommerce.resource;

import lombok.extern.slf4j.Slf4j;
import org.example.projetoecommerce.interfaces.IResource;
import org.example.projetoecommerce.model.BaseModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
@Slf4j
@RestController
@RequestMapping
public class BaseModelResource implements IResource<BaseModel, Integer> {


    @PostMapping(
            produces ={MediaType.APPLICATION_JSON_VALUE},
            consumes ={MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public BaseModel create(@RequestBody BaseModel entity) {
        log.info("Acessando método AlunoResource.create");
        log.debug("AlunoResource | valor recebido: {}", entity);
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
