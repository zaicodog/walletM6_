package com.monedero.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titular;
	private double saldo;
	private boolean USD;
	
	public Cuenta(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public Cuenta() {}
	
	public void retirar(double monto) {
		if(saldo >= monto) {
			saldo -= monto;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isUSD() {
		return USD;
	}

	public void setUSD(boolean uSD) {
		USD = uSD;
	}
	
	
	
	
	
}
