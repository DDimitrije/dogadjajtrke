package com.trke.dogadjaj.service;

import java.util.List;

import com.trke.dogadjaj.model.TakmicenjaGodina;

public interface TakmicenjaGodinaService {
	
		List<TakmicenjaGodina> findAll();
		TakmicenjaGodina findOne(Long id);
		void save(TakmicenjaGodina takmicenjaGodina);
		void remove(Long id);

	
		

}
