package br.com.leovieira.ds_desafio1.services;

import org.springframework.stereotype.Service;

import br.com.leovieira.ds_desafio1.entities.Order;

@Service
public class OrderService {
	
	ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public double total(Order order) {
		double total = (order.getBasic() * (1- order.getDiscount()/100));
		
		return total + shippingService.shipment(order);
	}
}
