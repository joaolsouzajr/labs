package com.faturista.dominio.model;

import java.io.Serializable;


public class Cliente implements Serializable {

  private Long id;
  private String documentNumber;
  private String name;
  private String email;

  public Cliente() {
  }

  public Cliente(Long id, String documentNumber, String name, String email) {
    this.id = id;
    this.documentNumber = documentNumber;
    this.name = name;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
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
}
