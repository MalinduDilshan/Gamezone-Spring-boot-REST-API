package com.gamezone.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.util.Date;

@Entity
@Table(name = "terminal")
public class Terminal {

    @Id
    @Column(name = "primary_key", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    @Column(name = "assign_time")
    @NotNull(message = "Assign time property can't be empty")
    private Date assignTime;

    @Column(name = "duration")
    @NotNull(message = "Duration property can't be empty")
    private double duration;

    @Column(name = "progress_value")
    @NotNull(message = "Progress value property can't be empty")
    private int progressValue;

    @Column(name = "left_time")
    @NotNull(message = "Left time value property can't be empty")
    private  Date leftTime;

    @Column(name = "status")
    @NotNull(message = "Status value property can't be empty")
    private  boolean status;

    @Column(name = "power_cut")
    @NotNull(message = "Power cut value property can't be empty")
    private  boolean powerCut;

    @Column(name = "computer_id")
    @NotNull(message = "Computer id value property can't be empty")
    private  long computerId;

    public Terminal() {
    }

    public Terminal(@NotNull(message = "Assign time property can't be empty") Date assignTime, @NotNull(message = "Duration property can't be empty") double duration, @NotNull(message = "Progress value property can't be empty") int progressValue, @NotNull(message = "Left time value property can't be empty") Date leftTime, @NotNull(message = "Status value property can't be empty") boolean status, @NotNull(message = "Power cut value property can't be empty") boolean powerCut, @NotNull(message = "Computer id value property can't be empty") long computerId) {
        this.assignTime = assignTime;
        this.duration = duration;
        this.progressValue = progressValue;
        this.leftTime = leftTime;
        this.status = status;
        this.powerCut = powerCut;
        this.computerId = computerId;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isPowerCut() {
        return powerCut;
    }

    public void setPowerCut(boolean powerCut) {
        this.powerCut = powerCut;
    }

    public long getComputerId() {
        return computerId;
    }

    public void setComputerId(long computerId) {
        this.computerId = computerId;
    }
}
