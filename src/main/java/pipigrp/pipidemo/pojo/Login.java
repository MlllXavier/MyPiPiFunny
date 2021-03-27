package pipigrp.pipidemo.pojo;

public class Login {
    private String ppId;

    private String username;

    private Integer password;

    public Login(String ppId, String username, Integer password) {
        this.ppId = ppId;
        this.username = username;
        this.password = password;
    }

    public Login() {
        super();
    }

    public String getPpId() {
        return ppId;
    }

    public void setPpId(String ppId) {
        this.ppId = ppId == null ? null : ppId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}