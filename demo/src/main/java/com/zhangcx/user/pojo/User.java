package com.zhangcx.user.pojo;

import java.util.Date;

public class User {
    private String uuid;

    private String usercode;

    private String nickname;

    private String password;

    private String freezeflag;

    private Date recordtime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getFreezeflag() {
        return freezeflag;
    }

    public void setFreezeflag(String freezeflag) {
        this.freezeflag = freezeflag == null ? null : freezeflag.trim();
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }
}