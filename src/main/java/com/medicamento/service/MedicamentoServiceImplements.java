package com.medicamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicamento.entity.Medicamento;
import com.medicamento.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImplements implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repo;

	@Override
	public Medicamento insertaActualizaMedicamento(Medicamento obj) {

		return repo.save(obj);
	}

	@Override
	public List<Medicamento> listaMedicamento() {

		return repo.findAll();
	}

}
