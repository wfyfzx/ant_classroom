package com.jk.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by ASUS on 2018/5/16.
 */
public class People implements Serializable {
    private static final long serialVersionUID = 7306508843024901955L;

    @Id
    private Integer peopleid;
    private String email;
    private Integer phone;
    private String peoplepass;
    private Integer ynvip;
    private String vipendtime;
    private String peoplename;
    private String peoplenickname;
    private Integer peoplesex;
    private Integer peopleage;

    private Integer minage;
    private Integer maxage;

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getPeoplepass() {
        return peoplepass;
    }

    public void setPeoplepass(String peoplepass) {
        this.peoplepass = peoplepass;
    }

    public Integer getYnvip() {
        return ynvip;
    }

    public void setYnvip(Integer ynvip) {
        this.ynvip = ynvip;
    }

    public String getVipendtime() {
        return vipendtime;
    }

    public void setVipendtime(String vipendtime) {
        this.vipendtime = vipendtime;
    }

    public String getPeoplename() {
        return peoplename;
    }

    public void setPeoplename(String peoplename) {
        this.peoplename = peoplename;
    }

    public String getPeoplenickname() {
        return peoplenickname;
    }

    public void setPeoplenickname(String peoplenickname) {
        this.peoplenickname = peoplenickname;
    }

    public Integer getPeoplesex() {
        return peoplesex;
    }

    public void setPeoplesex(Integer peoplesex) {
        this.peoplesex = peoplesex;
    }

    public Integer getPeopleage() {
        return peopleage;
    }

    public void setPeopleage(Integer peopleage) {
        this.peopleage = peopleage;
    }

    public Integer getMinage() {
        return minage;
    }

    public void setMinage(Integer minage) {
        this.minage = minage;
    }

    public Integer getMaxage() {
        return maxage;
    }

    public void setMaxage(Integer maxage) {
        this.maxage = maxage;
    }

    @Override
    public String toString() {
        return "People{" +
                "peopleid=" + peopleid +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", peoplepass='" + peoplepass + '\'' +
                ", ynvip=" + ynvip +
                ", vipendtime='" + vipendtime + '\'' +
                ", peoplename='" + peoplename + '\'' +
                ", peoplenickname='" + peoplenickname + '\'' +
                ", peoplesex=" + peoplesex +
                ", peopleage=" + peopleage +
                '}';
    }
}
