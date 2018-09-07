package com.gamezone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author Malindu Dilshan
 * @Year 2018
 * This class is an entity for Terminal
 */
@Entity
@Table(name = "terminal")
public class Terminal {

    /**
     * PrimaryKey of Terminal
     */
    @Id
    @Column(name = "primaryKey", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    /**
     * Assign time of Terminal
     */
    @Column(name = "assignTime")
    @NotNull(message = "Assign time property can't be empty")
    private Date assignTime;

    /**
     * Duration of Terminal
     */
    @Column(name = "duration")
    @NotNull(message = "Duration property can't be empty")
    private double duration;

    /**
     * Progress value of Terminal
     */
    @Column(name = "progressValue")
    @NotNull(message = "Progress value property can't be empty")
    private int progressValue;

    /**
     * Left time of Terminal
     */
    @Column(name = "leftTime")
    @NotNull(message = "Left time value property can't be empty")
    private Date leftTime;

    /**
     * Status of Terminal
     */
    @Column(name = "status")
    @NotNull(message = "Status value property can't be empty")
    private String status;

    /**
     * Power cut of Terminal
     */
    @Column(name = "powerCut")
    @NotNull(message = "Power cut value property can't be empty")
    private boolean powerCut;

    /**
     * Computer_primaryKey of Terminal
     */
    @Column(name = "computer_primaryKey", insertable = false, updatable = false)
    private long computer_primaryKey;

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
     * One to One Relationship of Terminal and Computer
     */
    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "computer_primaryKey")
    private Computer computer;

    public Terminal() {
    }

    public Terminal(@NotNull(message = "Assign time property can't be empty") Date assignTime, @NotNull(message = "Duration property can't be empty") double duration, @NotNull(message = "Progress value property can't be empty") int progressValue, @NotNull(message = "Left time value property can't be empty") Date leftTime, @NotNull(message = "Status value property can't be empty") String status, @NotNull(message = "Power cut value property can't be empty") boolean powerCut, long computer_primaryKey, String createdUser, Date createdDate, String modifiedUser, Date modifiedDate, Computer computer) {
        this.assignTime = assignTime;
        this.duration = duration;
        this.progressValue = progressValue;
        this.leftTime = leftTime;
        this.status = status;
        this.powerCut = powerCut;
        this.computer_primaryKey = computer_primaryKey;
        this.createdUser = createdUser;
        this.createdDate = createdDate;
        this.modifiedUser = modifiedUser;
        this.modifiedDate = modifiedDate;
        this.computer = computer;
    }

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getProgressValue() {
        return progressValue;
    }

    public void setProgressValue(int progressValue) {
        this.progressValue = progressValue;
    }

    public Date getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(Date leftTime) {
        this.leftTime = leftTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPowerCut() {
        return powerCut;
    }

    public void setPowerCut(boolean powerCut) {
        this.powerCut = powerCut;
    }

    public long getComputer_primaryKey() {
        return computer_primaryKey;
    }

    public void setComputer_primaryKey(long computer_primaryKey) {
        this.computer_primaryKey = computer_primaryKey;
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

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
