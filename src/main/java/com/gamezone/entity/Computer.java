package com.gamezone.entity;

import javax.persistence.*;

@Entity
@Table(name = "COMPUTER")
public class Computer {

  @Id
  @Column(name = "PRIMARY_KEY", nullable = false, unique = true)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long primary_key;

  @Column(name = "COMPUTER_NAME")
  private String computer_name;

  @Column(name = "IP_ADDRESS")
  private String ip_addresss;

  public Long getPrimary_key() {
    return primary_key;
  }

  public void setPrimary_key(Long primary_key) {
    this.primary_key = primary_key;
  }

  public String getComputer_name() {
    return computer_name;
  }

  public void setComputer_name(String computer_name) {
    this.computer_name = computer_name;
  }

  public String getIp_addresss() {
    return ip_addresss;
  }

  public void setIp_addresss(String ip_addresss) {
    this.ip_addresss = ip_addresss;
  }
}
