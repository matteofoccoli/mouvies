package com.example.mouvies.core.services;

import com.example.mouvies.core.domain.Movie;
import com.example.mouvies.core.events.movies.MovieCreatedEvent;
import com.example.mouvies.core.repositories.MoviesRepository;

/**
 * Created by matteo on 23/08/14.
 */
public class MoviesService {

  private MoviesRepository repo;

  public MovieCreatedEvent create(Movie movie) {
    try {
      Movie result = this.repo.create(movie);
      return new MovieCreatedEvent(result, false);
    } catch (MoviesRepository.Exception e) {
      return new MovieCreatedEvent(movie, true);
    }
  }

}
