package pipigrp.pipidemo.pojo;

public class Collections {
    private String idCollection;

    private String id;

    private String ppId;

    public Collections(String idCollection, String id, String ppId) {
        this.idCollection = idCollection;
        this.id = id;
        this.ppId = ppId;
    }

    public Collections() {
        super();
    }

    public String getIdCollection() {
        return idCollection;
    }

    public void setIdCollection(String idCollection) {
        this.idCollection = idCollection == null ? null : idCollection.trim();
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