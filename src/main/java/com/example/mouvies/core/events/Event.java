package com.example.mouvies.core.events;

/**
 * Created by matteo on 23/08/14.
 */
public class Event {
  private boolean error;

  public Event(boolean error) {
    this.error = error;
  }

  public boolean isError() {
    return error;
  }

}
