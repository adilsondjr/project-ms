package br.com.adilsondjr.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.adilsondjr.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Adilson", 200.00, days);
	}
}
