package com.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId
	private ScorePK id = new ScorePK();
	private Double value;

	public Score() {

	}

	// adiciona a referencia do movie
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	// adiciona a referencia do movie
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getScorePk() {
		return id;
	}

	public void setScorePk(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
