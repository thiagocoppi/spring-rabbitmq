package com.rabbitmq.example;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Random;

@SpringBootApplication
@EnableScheduling
public class ExampleApplication {

	@Autowired
	private RabbitTemplate rabbitTemplate;


	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

	@Bean
	public RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(producerJackson2MessageConverter());
		return rabbitTemplate;
	}

	@Bean
	public Jackson2JsonMessageConverter producerJackson2MessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	@Scheduled(fixedDelay = 250L)
	public void runAluno() {
			System.out.println("Publicando mensagem aluno na mensageria");
			Random random = new Random();
			int randomNum = random.nextInt(100);
			AlunoModel alunoModel = new AlunoModel();
			alunoModel.setNomeAluno("Aluno " + String.valueOf(randomNum));
			alunoModel.setNumeroAluno(randomNum);
			alunoModel.setSalaAluno(randomNum);
			rabbitTemplate.convertAndSend("ExchangeSoftware", "keyAPI", alunoModel);
	}

	@Scheduled(fixedDelay = 1000L)
	public void runUsuario() {

			System.out.println("Publicando mensagem usuario na mensageria");
			UsuarioModel usuarioModel = new UsuarioModel();
			Random random = new Random();
			int randomNum = random.nextInt(100);
			usuarioModel.setNome("Usuario numero " + String.valueOf(randomNum));
			usuarioModel.setIdade(randomNum);
			rabbitTemplate.convertAndSend("ExchangeSoftware", "keyAPI", usuarioModel);
	}

}
