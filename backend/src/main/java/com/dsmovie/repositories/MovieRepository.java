package com.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
