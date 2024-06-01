package com.monedero.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monedero.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
	
}
