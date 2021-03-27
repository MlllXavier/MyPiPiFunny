package pipigrp.pipidemo.pojo;

public class Likes {
    private String idLike;

    private String id;

    private String ppId;

    public Likes(String idLike, String id, String ppId) {
        this.idLike = idLike;
        this.id = id;
        this.ppId = ppId;
    }

    public Likes() {
        super();
    }

    public String getIdLike() {
        return idLike;
    }

    public void setIdLike(String idLike) {
        this.idLike = idLike == null ? null : idLike.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPpId() {
        return ppId;
    }

    public void setPpId(String ppId) {
        this.ppId = ppId == null ? null : ppId.trim();
    }
}