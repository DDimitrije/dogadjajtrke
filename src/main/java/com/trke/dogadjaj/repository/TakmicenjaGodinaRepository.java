package com.trke.dogadjaj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trke.dogadjaj.model.TakmicenjaGodina;

@Repository
public interface TakmicenjaGodinaRepository extends JpaRepository<TakmicenjaGodina, Long> {

}
