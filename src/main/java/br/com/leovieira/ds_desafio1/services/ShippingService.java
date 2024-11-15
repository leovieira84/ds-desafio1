package br.com.leovieira.ds_desafio1.services;

import org.springframework.stereotype.Service;

import br.com.leovieira.ds_desafio1.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double frete = 0;
		
		if(order.getBasic() < 100) {
			frete = 20.0;
		} else if (order.getBasic() < 200) {
			frete = 12.0;
		}
		
		return frete;
	}

}
