package com.rabbitmq.pratice.Mapper;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class DozerMapperFactory {
    /**
     * Abstração do mapper do dozer para mapeamento
     * @param originalObject Objeto que deseja mapear
     * @param convertedObject Objeto convertido
     * @param <T> Parâmetro genérico do objeto que será retornado
     * @return return objeto convertido com os dados.
     */
    public <T> T dozerMapperFactory(Object originalObject, Class<T> convertedObject) throws Exception{
        return new DozerBeanMapper().map(originalObject, convertedObject);
    }
}
