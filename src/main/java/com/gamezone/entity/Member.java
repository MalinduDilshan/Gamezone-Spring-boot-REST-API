package com.gamezone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Author Malindu Dilshan
 * @Year 2018
 * This class is an entity for Member
 */
@Entity
@Table(name = "member")
public class Member {

    /**
     * PrimaryKey of Member
     */
    @Id
    @Column(name = "primaryKey", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long primaryKey;

    /**
     * First Name of Member
     */
    @Column(name = "firstName")
    private String firstName;

    /**
     * Last Name of Member
     */
    @Column(name = "lastName")
    private String lastName;

    /**
     * NIC of Member
     */
    @Column(name = "nic")
    private String nic;

    /**
     * Email of Member
     */
    @Column(name = "email")
    private String email;

    /**
     * Mobile of Member
     */
    @Column(name = "mobile")
    private long mobile;

    /**
     * Photo of Member
     */
    @Lob
    @Column(name = "photo", length = 100000000)
    private byte[] photo;

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
     * One to Many Relationship of Member and TerminalDetail
     */
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "member")
    private List<TerminalDetail> terminalDetailList;

    public Member() {
    }

    public Member(String firstName, String lastName, String nic, String email, long mobile, byte[] photo, String createdUser, Date createdDate, String modifiedUser, Date modifiedDate, List<TerminalDetail> terminalDetailList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.email = email;
        this.mobile = mobile;
        this.photo = photo;
        this.createdUser = createdUser;
        this.createdDate = createdDate;
        this.modifiedUser = modifiedUser;
        this.modifiedDate = modifiedDate;
        this.terminalDetailList = terminalDetailList;
    }

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
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

    public List<TerminalDetail> getTerminalDetailList() {
        return terminalDetailList;
    }

    public void setTerminalDetailList(List<TerminalDetail> terminalDetailList) {
        this.terminalDetailList = terminalDetailList;
    }
}
