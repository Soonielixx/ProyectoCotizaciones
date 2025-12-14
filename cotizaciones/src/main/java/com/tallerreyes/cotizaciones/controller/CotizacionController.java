package com.tallerreyes.cotizaciones.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tallerreyes.cotizaciones.model.Cotizacion;
import com.tallerreyes.cotizaciones.repository.CotizacionRepository;

@RestController
@RequestMapping("/api/cotizaciones")
public class CotizacionController {

    private final CotizacionRepository repo;

    public CotizacionController(CotizacionRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Cotizacion> listar() {
        return repo.findAll();
    }
}

