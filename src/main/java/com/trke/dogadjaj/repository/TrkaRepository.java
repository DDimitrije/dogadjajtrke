package com.trke.dogadjaj.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.trke.dogadjaj.model.TakmicenjaGodina;
import com.trke.dogadjaj.model.Trka;
import com.trke.dogadjaj.model.Trkac;

@Repository
public interface TrkaRepository extends JpaRepository<Trka, Long> {

}

