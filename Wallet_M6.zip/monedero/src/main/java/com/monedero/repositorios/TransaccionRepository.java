package com.monedero.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monedero.modelo.Transaccion;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion,Long> {

}
