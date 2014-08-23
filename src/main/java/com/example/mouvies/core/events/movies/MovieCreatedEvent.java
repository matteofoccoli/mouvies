package com.example.mouvies.core.events.movies;

import com.example.mouvies.core.domain.Movie;
import com.example.mouvies.core.events.Event;

/**
 * Created by matteo on 23/08/14.
 */
public class MovieCreatedEvent extends Event {
  private Movie movie;

  public MovieCreatedEvent(Movie movie, boolean error) {
    super(error);

    this.movie = movie;
  }

  public Movie getMovie() {
    return movie;
  }
}
