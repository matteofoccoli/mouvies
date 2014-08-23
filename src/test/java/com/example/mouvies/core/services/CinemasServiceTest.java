package com.example.mouvies.core.services;

import com.example.mouvies.core.domain.Cinema;
import com.example.mouvies.core.events.cinemas.CinemaCreatedEvent;
import com.example.mouvies.core.repositories.CinemasRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Mockito.verify;

public class CinemasServiceTest {

  @InjectMocks
  private CinemasService service;

  @Mock
  private CinemasRepository repo;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void createsANewCinema() throws Exception {
    CinemaCreatedEvent result = service.create(new Cinema("Prova"));

    verify(repo).create(any(Cinema.class));
    assertThat(result.isError(), is(false));
  }
}