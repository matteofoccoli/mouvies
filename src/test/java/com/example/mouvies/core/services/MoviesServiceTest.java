package com.example.mouvies.core.services;

import com.example.mouvies.core.domain.Movie;
import com.example.mouvies.core.repositories.MoviesRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

public class MoviesServiceTest {

  @InjectMocks
  private MoviesService service;

  @Mock
  private MoviesRepository repo;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void createsANewMovie() throws Exception {
    service.create(new Movie("Star Wars"));

    verify(repo).create(any(Movie.class));
  }


}