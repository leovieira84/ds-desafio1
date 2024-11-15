package br.com.leovieira.ds_desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.leovieira.ds_desafio1.entities.Order;
import br.com.leovieira.ds_desafio1.services.OrderService;

@SpringBootApplication
public class DsDesafio1Application implements CommandLineRunner {
	
	@Autowired
	OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DsDesafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order pedido1 = new Order(1034, 150.0, 20.0);
		Order pedido2 = new Order(2282, 800.0, 10.0);
		Order pedido3 = new Order(1309, 95.9, 0.0);
		
		System.out.println("Pedido código " + pedido1.getCode() + "\nValor total: R$ " + orderService.total(pedido1));
		System.out.println("Pedido código " + pedido2.getCode() + "\nValor total: R$ " + orderService.total(pedido2));
		System.out.println("Pedido código " + pedido3.getCode() + "\nValor total: R$ " + orderService.total(pedido3));
	}
}
