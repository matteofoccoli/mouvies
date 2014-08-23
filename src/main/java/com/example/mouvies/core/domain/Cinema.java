package com.example.mouvies.core.domain;

/**
 * Created by matteo on 23/08/14.
 */
public class Cinema {
  private Long id;
  private String name;

  public Cinema(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
