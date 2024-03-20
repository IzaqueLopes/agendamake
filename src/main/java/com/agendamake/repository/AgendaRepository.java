package com.agendamake.repository;

import org.springframework.data.repository.CrudRepository;

import com.agendamake.models.Evento;

public interface AgendaRepository extends CrudRepository<Evento, Long>{
	Evento findByCodigo(long codigo);
}