package com.example.mouvies.core.services;

import com.example.mouvies.core.domain.Cinema;
import com.example.mouvies.core.events.cinemas.CinemaCreatedEvent;
import com.example.mouvies.core.repositories.CinemasRepository;

/**
 * Created by matteo on 23/08/14.
 */
public class CinemasService {

  private CinemasRepository repo;

  public CinemasService(CinemasRepository repo) {
    this.repo = repo;
  }

  public CinemaCreatedEvent create(Cinema cinema){
    try {
      Cinema result = repo.create(cinema);
      return new CinemaCreatedEvent(result, false);
    } catch (CinemasRepository.Exception e) {
      return new CinemaCreatedEvent(cinema, true);
    }
  }

}
