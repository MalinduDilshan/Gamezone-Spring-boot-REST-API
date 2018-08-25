package com.gamezone.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "computer")
public class Computer {

  @Id
  @Column(name = "primary_key", nullable = false, unique = true)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long primary_key;

  @Column(name = "computer_name")
  @NotNull(message = "Computer Name property can't be empty")
  private String computer_name;

  @Column(name = "ip_address")
  @NotNull(message = "Ip Address property can't be empty")
  private String ip_address;

  public Computer() {
  }

  public Computer(@NotNull(message = "Computer Name property can't be empty") String computer_name, @NotNull(message = "Ip Address property can't be empty") String ip_address) {
    this.computer_name = computer_name;
    this.ip_address = ip_address;
  }

  public long getPrimary_key() {
    return primary_key;
  }

  public void setPrimary_key(long primary_key) {
    this.primary_key = primary_key;
  }

  public String getComputer_name() {
    return computer_name;
  }

  public void setComputer_name(String computer_name) {
    this.computer_name = computer_name;
  }

  public String getIp_address() {
    return ip_address;
  }

  public void setIp_address(String ip_address) {
    this.ip_address = ip_address;
  }
}
