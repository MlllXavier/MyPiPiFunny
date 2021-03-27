package pipigrp.pipidemo.pojo;

public class Userinfo {
    private String ppId;

    private String nickname;

    private String sign;

    private String sex;

    private String birthday;

    private String occupation;

    private String photopath;

    public Userinfo(String ppId, String nickname, String sign, String sex, String birthday, String occupation, String photopath) {
        this.ppId = ppId;
        this.nickname = nickname;
        this.sign = sign;
        this.sex = sex;
        this.birthday = birthday;
        this.occupation = occupation;
        this.photopath = photopath;
    }

    public Userinfo() {
        super();
    }

    public String getPpId() {
        return ppId;
    }

    public void setPpId(String ppId) {
        this.ppId = ppId == null ? null : ppId.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath == null ? null : photopath.trim();
    }
}