package com.trke.dogadjaj.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


import com.trke.dogadjaj.model.TakmicenjaGodina;

import com.trke.dogadjaj.web.dto.TakmicenjaGodinaDTO;

@Component
public class TakmicenjaGodinaTOTakmicenjaGodinaDTO implements Converter<TakmicenjaGodina, TakmicenjaGodinaDTO> {

	@Override
	public TakmicenjaGodinaDTO convert(TakmicenjaGodina takmicenjaGodina) {
		TakmicenjaGodinaDTO takmicenjaGodinaDTO = new TakmicenjaGodinaDTO();
		takmicenjaGodinaDTO.setId(takmicenjaGodina.getId());
//		takmicenjaGodinaDTO.setNaziv(takmicenjaGodina.getNaziv());
//		takmicenjaGodinaDTO.setPIB(takmicenjaGodina.getPIB());
//		takmicenjaGodinaDTO.setDrzava(takmicenjaGodina.getDrzava());
		return takmicenjaGodinaDTO;
	}

	public List<TakmicenjaGodinaDTO> convert(List<TakmicenjaGodina> takmicenjaGodinaLista) {
		List<TakmicenjaGodinaDTO> ret = new ArrayList<>();

		for (TakmicenjaGodina i : takmicenjaGodinaLista) {
			ret.add(convert(i));
		}

		return ret;
	}

}
