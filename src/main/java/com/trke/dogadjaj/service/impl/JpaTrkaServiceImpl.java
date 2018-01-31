package com.trke.dogadjaj.service.impl;


import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trke.dogadjaj.model.Trka;
import com.trke.dogadjaj.repository.TrkaRepository;
import com.trke.dogadjaj.service.TrkaService;


@Service
@Transactional
public class JpaTrkaServiceImpl implements TrkaService {
	@Autowired
	private TrkaRepository trkaRepository;

	@Override
	public List<Trka> findAll() {
		return trkaRepository.findAll();
	}

	@Override
	public Trka findOne(Long id) {
		return trkaRepository.findOne(id);
	}

	@Override
	public void save(Trka trka) {
		trkaRepository.save(trka);
	}

	@Override
	public void remove(Long id) {
		trkaRepository.delete(id);
	}
}
