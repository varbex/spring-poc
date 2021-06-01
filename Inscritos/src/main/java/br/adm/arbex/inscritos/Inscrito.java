package br.adm.arbex.inscritos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inscrito {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String name;
  
  @Column(unique=true)
  private String email;
  
  private boolean aceito;
  
  private String video;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

public String getVideo() {
	return video;
}

public void setVideo(String video) {
	this.video = video;
}

public boolean isAceito() {
	return aceito;
}

public void setAceito(boolean aceito) {
	this.aceito = aceito;
}
}