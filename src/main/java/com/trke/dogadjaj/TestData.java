package com.trke.dogadjaj;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trke.dogadjaj.model.TakmicenjaGodina;
import com.trke.dogadjaj.model.Manifestacija;
import com.trke.dogadjaj.service.TakmicenjaGodinaService;
import com.trke.dogadjaj.service.ManifestacijaService;

import com.trke.dogadjaj.model.Manifestacija;
import com.trke.dogadjaj.model.TakmicenjaGodina;

@Component
public class TestData {
	@Autowired
	private TakmicenjaGodinaService takmicenjaGodinaService;
	@Autowired
	private ManifestacijaService manifestacijaService;

	@PostConstruct
	public void init() {
		
		TakmicenjaGodina tg1 = new TakmicenjaGodina();
		tg1.setNazivTrke("Polet1");
		takmicenjaGodinaService.save(tg1);
		
		TakmicenjaGodina tg2 = new TakmicenjaGodina();
		tg2.setNazivTrke("Polet2");
		takmicenjaGodinaService.save(tg2);
		
		
		Manifestacija m1 = new Manifestacija();
		m1.setNaziv("1100110011");
		m1.setTakmicenjaGodina(tg1);
		m1.setDatumOdrzavanja("2012-05-20T09:00:00.00"); //new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2012-05-20T09:00:00.000Z")
		m1.setMestoOdrzavanja("mesto odrzavanja 1");
		manifestacijaService.save(m1);
		
		Manifestacija m2 = new Manifestacija();
		m2.setNaziv("12312312");
		m2.setTakmicenjaGodina(tg2);
		m2.setDatumOdrzavanja("2013-05-20T09:00:00.00");
		m2.setMestoOdrzavanja("mesto odrzavanja 2");
		manifestacijaService.save(m2);

	}
}
