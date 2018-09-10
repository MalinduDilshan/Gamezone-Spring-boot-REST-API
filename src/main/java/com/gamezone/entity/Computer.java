package com.gamezone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Author Malindu Dilshan
 * @Year 2018
 * This class is an entity for Computer
 */
@Entity
@Table(name = "computer")
public class Computer {

  /**
   * PrimaryKey of Computer
   */
  @Id
  @Column(name = "primaryKey", nullable = false, unique = true)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long primaryKey;

  /**
   * Name of Computer
   */
  @Column(name = "computerName")
  @NotNull(message = "Computer Name property can't be empty")
  private String computerName;

  /**
   * Ip Address of Computer
   */
  @Column(name = "ipAddress")
  @NotNull(message = "Ip Address property can't be empty")
  private String ipAddress;

  /**
   * Created User
   */
  private String createdUser;
  /**
   * Created Date
   */
  private Date createdDate;
  /**
   * Modified User
   */
  private String modifiedUser;
  /**
   * Modified Date
   */
  private Date modifiedDate;

  /**
   * One to One Relationship of Computer and Terminal
   */
  @OneToOne(cascade = CascadeType.ALL, mappedBy = "computer")
  private Terminal terminal;

  /**
   * One to Many Relationship of Computer and TerminalDetail
   */
  @JsonIgnore
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "computer")
  private List<TerminalDetail> terminalDetailList;

  public Computer() {
  }

  public Computer(@NotNull(message = "Computer Name property can't be empty") String computerName, @NotNull(message = "Ip Address property can't be empty") String ipAddress, String createdUser, Date createdDate, String modifiedUser, Date modifiedDate, Terminal terminal, List<TerminalDetail> terminalDetailList) {
    this.computerName = computerName;
    this.ipAddress = ipAddress;
    this.createdUser = createdUser;
    this.createdDate = createdDate;
    this.modifiedUser = modifiedUser;
    this.modifiedDate = modifiedDate;
    this.terminal = terminal;
    this.terminalDetailList = terminalDetailList;
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

  public String getCreatedUser() {
    return createdUser;
  }

  public void setCreatedUser(String createdUser) {
    this.createdUser = createdUser;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public String getModifiedUser() {
    return modifiedUser;
  }

  public void setModifiedUser(String modifiedUser) {
    this.modifiedUser = modifiedUser;
  }

  public Date getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public Terminal getTerminal() {
    return terminal;
  }

  public void setTerminal(Terminal terminal) {
    this.terminal = terminal;
  }

  public List<TerminalDetail> getTerminalDetailList() {
    return terminalDetailList;
  }

  public void setTerminalDetailList(List<TerminalDetail> terminalDetailList) {
    this.terminalDetailList = terminalDetailList;
  }
}
