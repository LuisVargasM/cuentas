package com.VargasTest.cuentas.repositorio;

import com.VargasTest.cuentas.modelo.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentasRepositorio extends JpaRepository<Cuenta, Integer>{
}
