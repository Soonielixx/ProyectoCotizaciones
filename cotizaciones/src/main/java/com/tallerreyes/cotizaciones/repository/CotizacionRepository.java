package com.tallerreyes.cotizaciones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tallerreyes.cotizaciones.model.Cotizacion;

public interface CotizacionRepository
        extends JpaRepository<Cotizacion, Long> {

    List<Cotizacion> findByCliente(String cliente);
}

