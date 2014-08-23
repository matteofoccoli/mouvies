package com.example.mouvies.rest.controllers;

import com.example.mouvies.core.domain.Cinema;
import com.example.mouvies.core.events.cinemas.CinemaCreatedEvent;
import com.example.mouvies.core.services.CinemasService;
import com.example.mouvies.rest.models.CinemaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by matteo on 23/08/14.
 */
@RestController
public class CinemasController {

  @Autowired
  private CinemasService service;

  @RequestMapping(value="/cinemas", method = RequestMethod.POST)
  public @ResponseBody
  CinemaResponse create(
      @RequestParam("name") String name) {
    final CinemaCreatedEvent evt = service.create(new Cinema(name));
    if (evt.isError())
      throw new RuntimeException("Error creating movie");
    CinemaResponse response = new CinemaResponse();
    response.setId(evt.getCinema().getId());
    response.setName(evt.getCinema().getName());
    return response;
  }

}
