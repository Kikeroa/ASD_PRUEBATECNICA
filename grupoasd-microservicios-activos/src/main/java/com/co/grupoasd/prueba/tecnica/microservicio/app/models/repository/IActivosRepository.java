package com.co.grupoasd.prueba.tecnica.microservicio.app.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.co.grupoasd.prueba.tecnica.microservicio.app.models.entity.Activos;

public interface IActivosRepository extends PagingAndSortingRepository<Activos, Long> {

	
}
