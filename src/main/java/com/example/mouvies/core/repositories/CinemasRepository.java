package com.example.mouvies.core.repositories;

import com.example.mouvies.core.domain.Cinema;

/**
 * Created by matteo on 23/08/14.
 */
public interface CinemasRepository {

  Cinema create(Cinema movie) throws Exception;

  public static final class Exception extends java.lang.Exception {
    public Exception(String message) {
      super(message);
    }
  }

}
