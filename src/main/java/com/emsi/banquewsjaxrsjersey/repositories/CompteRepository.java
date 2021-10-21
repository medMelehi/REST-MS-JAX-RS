package com.emsi.banquewsjaxrsjersey.repositories;

import com.emsi.banquewsjaxrsjersey.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {

}
