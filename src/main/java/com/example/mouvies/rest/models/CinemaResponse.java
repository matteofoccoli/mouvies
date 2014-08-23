package com.example.mouvies.rest.models;

/**
 * Created by matteo on 23/08/14.
 */
public class CinemaResponse {
  private String name;
  private Long id;

  public CinemaResponse() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
