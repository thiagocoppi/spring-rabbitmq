package com.rabbitmq.pratice.Controller;

import com.rabbitmq.pratice.Mapper.DozerMapperFactory;
import com.rabbitmq.pratice.Model.UsuarioEntrada;
import com.rabbitmq.pratice.Model.UsuarioModel;
import com.rabbitmq.pratice.Model.UsuarioModelMappered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MapperController {

    @Autowired
    private DozerMapperFactory mapperFactory;

    @GetMapping
    public UsuarioModel converterUsingDozer(@RequestBody UsuarioEntrada usuarioEntrada){

        try {
            UsuarioModel usuarioModel = mapperFactory.dozerMapperFactory(usuarioEntrada, UsuarioModel.class);
            return usuarioModel;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
