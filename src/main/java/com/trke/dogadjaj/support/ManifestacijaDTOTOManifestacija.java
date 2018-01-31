package com.trke.dogadjaj.support;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.trke.dogadjaj.model.Manifestacija;
import com.trke.dogadjaj.service.ManifestacijaService;
import com.trke.dogadjaj.service.TakmicenjaGodinaService;
import com.trke.dogadjaj.web.dto.ManifestacijaDTO;


@Component
public class ManifestacijaDTOTOManifestacija implements Converter<ManifestacijaDTO, Manifestacija> {

	@Autowired
	private ManifestacijaService manifestacijaService;
	@Autowired
	private TakmicenjaGodinaService takmicenjaGodinaService;

	
	@Override
	public Manifestacija convert(ManifestacijaDTO source) {
		Manifestacija manifestacija;
		if (source.getId() == null) {
			manifestacija = new Manifestacija();
			manifestacija.setTakmicenjaGodina(takmicenjaGodinaService.findOne(source.getTakmicenjaGodinaId()));
			// pivo.setVrstaPiva(vrstaService.findOne(source.getVrstaPivaId()));
		} else {
			manifestacija = manifestacijaService.findOne(source.getId());
		}
		manifestacija.setNaziv(source.getNaziv());
		manifestacija.setDatumOdrzavanja(source.getDatumOdrzavanja());
		manifestacija.setMestoOdrzavanja(source.getMestoOdrzavanja());
		manifestacija.setTakmicenjaGodina(takmicenjaGodinaService.findOne(source.getTakmicenjaGodinaId()));
		//manifestacija.setTakmicenjaGodina(source.getTakmicenjaGodinaId());
		
		return manifestacija;
	}
}
