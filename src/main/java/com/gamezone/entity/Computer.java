package com.gamezone.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "computer")
public class Computer {

  @Id
  @Column(name = "primaryKey", nullable = false, unique = true)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long primaryKey;

  @Column(name = "computerName")
  @NotNull(message = "Computer Name property can't be empty")
  private String computerName;

  @Column(name = "ipAddress")
  @NotNull(message = "Ip Address property can't be empty")
  private String ipAddress;

  @OneToOne(cascade = CascadeType.ALL, mappedBy = "computer")
  private Terminal terminal;

  public Computer() {
  }

  public Computer(@NotNull(message = "Computer Name property can't be empty") String computerName, @NotNull(message = "Ip Address property can't be empty") String ipAddress, Terminal terminal) {
    this.computerName = computerName;
    this.ipAddress = ipAddress;
    this.terminal = terminal;
  }

  public long getPrimaryKey() {
    return primaryKey;
  }

  public void setPrimaryKey(long primaryKey) {
    this.primaryKey = primaryKey;
  }

  public String getComputerName() {
    return computerName;
  }

  public void setComputerName(String computerName) {
    this.computerName = computerName;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Terminal getTerminal() {
    return terminal;
  }

  public void setTerminal(Terminal terminal) {
    this.terminal = terminal;
  }
}
