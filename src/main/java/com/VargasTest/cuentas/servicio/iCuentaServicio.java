package com.VargasTest.cuentas.servicio;

import com.VargasTest.cuentas.modelo.Cuenta;

import java.util.List;

public interface iCuentaServicio {
    public List<Cuenta> listarCuentas();

    public Cuenta buscarCuentaPorId(Integer idCuenta);

    public void guardarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Cuenta cuenta);

}
