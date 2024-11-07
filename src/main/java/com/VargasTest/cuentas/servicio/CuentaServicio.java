package com.VargasTest.cuentas.servicio;

import com.VargasTest.cuentas.modelo.Cuenta;
import com.VargasTest.cuentas.repositorio.CuentasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServicio implements iCuentaServicio{

    @Autowired
    private CuentasRepositorio cuentasRepositorio;
    @Override
    public List<Cuenta> listarCuentas() {
        return cuentasRepositorio.findAll();
    }

    @Override
    public Cuenta buscarCuentaPorId(Integer idCuenta) {
        Cuenta cuenta = cuentasRepositorio.findById(idCuenta).orElse(null);
        return cuenta;
    }

    @Override
    public void guardarCuenta(Cuenta cuenta) {
        cuentasRepositorio.save(cuenta);

    }

    @Override
    public void eliminarCuenta(Cuenta cuenta) {
        cuentasRepositorio.delete(cuenta);
    }
}
