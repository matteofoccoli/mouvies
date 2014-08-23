package com.example.mouvies.core.events.cinemas;

import com.example.mouvies.core.domain.Cinema;
import com.example.mouvies.core.events.Event;

/**
 * Created by matteo on 23/08/14.
 */
public class CinemaCreatedEvent extends Event {
  private Cinema cinema;

  public CinemaCreatedEvent(Cinema cinema, boolean error) {
    super(error);
    this.cinema = cinema;
  }

  public Cinema getCinema() {
    return cinema;
  }
}
