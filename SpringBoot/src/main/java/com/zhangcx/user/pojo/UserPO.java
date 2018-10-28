package com.zhangcx.user.pojo;

import java.util.Date;

public class UserPO {
    private String uuid;

    private String usercode;

    private String username;

    private Date recordtime;

    private String freezeflag;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public String getFreezeflag() {
        return freezeflag;
    }

    public void setFreezeflag(String freezeflag) {
        this.freezeflag = freezeflag == null ? null : freezeflag.trim();
    }
}