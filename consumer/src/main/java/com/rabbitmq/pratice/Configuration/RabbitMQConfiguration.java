package com.rabbitmq.pratice.Configuration;

import com.rabbitmq.pratice.Model.AlunoModel;
import com.rabbitmq.pratice.Model.UsuarioModel;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


@Configuration
@EnableRabbit
public class RabbitMQConfiguration {
    private static final String QUEUE_SOFTWARE = "FilaSoftware";

    @Bean
    Queue queueSoftware() {
        return new Queue(QUEUE_SOFTWARE, false);
    }

    @Bean
    Exchange exchangeDefault() {
        return ExchangeBuilder.topicExchange("ExchangeSoftware")
                .durable(false)
                .autoDelete()
                .build();
    }

    @Bean
    Binding binding() {
        return BindingBuilder.bind(queueSoftware())
                .to(exchangeDefault())
                .with("keyAPI")
                .noargs();
    }

    @Bean
    public Jackson2JsonMessageConverter listnerMessageConverter(){
        Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
        DefaultClassMapper classMapper = new DefaultClassMapper();

        Map<String, Class<?>> idClassMapping = new HashMap<String, Class<?>>();
        idClassMapping.put(
                "com.rabbitmq.example.AlunoModel", AlunoModel.class);
        idClassMapping.put(
                "com.rabbitmq.example.UsuarioModel", UsuarioModel.class);
        classMapper.setIdClassMapping(idClassMapping);
        converter.setClassMapper(classMapper);

        return converter;
    }

    @Bean
    public RabbitTemplate rabbitTemplate (final ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(listnerMessageConverter());
        return rabbitTemplate;
    }


}



