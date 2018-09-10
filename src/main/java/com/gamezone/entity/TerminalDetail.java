package com.gamezone.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author Malindu Dilshan
 * @Year 2018
 * This class is an entity for TerminalDetail
 */
@Entity
@Table(name = "terminaldetails")
public class TerminalDetail {

    /**
     * PrimaryKey of TerminalDetail
     */
    @Id
    @Column(name = "primaryKey", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    /**
     * Started Time of TerminalDetail
     */
    @Column(name = "startedTime")
    private Date startedTime;

    /**
     * Usage of TerminalDetail
     */
    @Column(name = "terminalUsage")
    private Date terminalUsage;

    /**
     * Assign Date of TerminalDetail
     */
    @Column(name = "assignDate")
    private Date assignDate;

    /**
     * Payment of TerminalDetail
     */
    @Column(name = "payment")
    private double payment;

    /**
     * One to One Relationship of Computer and TerminalDetail
     */
    @ManyToOne
    @JoinColumn(name = "computer_primaryKey", nullable=false)
    private Computer computer;

    /**
     * One to One Relationship of Member and TerminalDetail
     */
    @ManyToOne
    @JoinColumn(name = "member_primaryKey", nullable=false)
    private Member member;

    /**
     * One to One Relationship of User and TerminalDetail
     */
    @ManyToOne
    @JoinColumn(name = "user_primaryKey", nullable=false)
    private User user;

    public TerminalDetail() {
    }

    public TerminalDetail(Date startedTime, Date terminalUsage, Date assignDate, double payment, Computer computer, Member member, User user) {
        this.startedTime = startedTime;
        this.terminalUsage = terminalUsage;
        this.assignDate = assignDate;
        this.payment = payment;
        this.computer = computer;
        this.member = member;
        this.user = user;
    }

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Date getStartedTime() {
        return startedTime;
    }

    public void setStartedTime(Date startedTime) {
        this.startedTime = startedTime;
    }

    public Date getTerminalUsage() {
        return terminalUsage;
    }

    public void setTerminalUsage(Date terminalUsage) {
        this.terminalUsage = terminalUsage;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
