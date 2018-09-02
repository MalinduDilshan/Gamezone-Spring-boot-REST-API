package com.gamezone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "terminal")
public class Terminal {

    @Id
    @Column(name = "primaryKey", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column(name = "assignTime")
    @NotNull(message = "Assign time property can't be empty")
    private Date assignTime;

    @Column(name = "duration")
    @NotNull(message = "Duration property can't be empty")
    private double duration;

    @Column(name = "progressValue")
    @NotNull(message = "Progress value property can't be empty")
    private int progressValue;

    @Column(name = "leftTime")
    @NotNull(message = "Left time value property can't be empty")
    private  Date leftTime;

    @Column(name = "status")
    @NotNull(message = "Status value property can't be empty")
    private  String status;

    @Column(name = "powerCut")
    @NotNull(message = "Power cut value property can't be empty")
    private  boolean powerCut;

    @Column(name = "computer_primaryKey", insertable = false, updatable = false)
    private long computer_primaryKey;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "computer_primaryKey")
    private Computer computer;

    public Terminal() {
    }

    public Terminal(@NotNull(message = "Assign time property can't be empty") Date assignTime, @NotNull(message = "Duration property can't be empty") double duration, @NotNull(message = "Progress value property can't be empty") int progressValue, @NotNull(message = "Left time value property can't be empty") Date leftTime, @NotNull(message = "Status value property can't be empty") String status, @NotNull(message = "Power cut value property can't be empty") boolean powerCut, Computer computer) {
        this.assignTime = assignTime;
        this.duration = duration;
        this.progressValue = progressValue;
        this.leftTime = leftTime;
        this.status = status;
        this.powerCut = powerCut;
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

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
