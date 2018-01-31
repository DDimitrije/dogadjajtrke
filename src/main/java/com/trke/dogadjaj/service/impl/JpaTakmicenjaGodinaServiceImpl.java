package com.trke.dogadjaj.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trke.dogadjaj.model.TakmicenjaGodina;
import com.trke.dogadjaj.repository.TakmicenjaGodinaRepository;
import com.trke.dogadjaj.service.TakmicenjaGodinaService;

@Service
@Transactional
public class JpaTakmicenjaGodinaServiceImpl implements TakmicenjaGodinaService {
	@Autowired
	private TakmicenjaGodinaRepository takmicenjaGodinaRepository;

	@Override
	public List<TakmicenjaGodina> findAll() {
		return takmicenjaGodinaRepository.findAll();
	}

	@Override
	public TakmicenjaGodina findOne(Long id) {
		return takmicenjaGodinaRepository.findOne(id);
	}

	@Override
	public void save(TakmicenjaGodina takmicenjaGodina) {
		takmicenjaGodinaRepository.save(takmicenjaGodina);
	}

	@Override
	public void remove(Long id) {
		takmicenjaGodinaRepository.delete(id);
	}
}