package pipigrp.pipidemo.pojo;

public class HistoryKey {
    private String idHistory;

    private String ppId;

    public HistoryKey(String idHistory, String ppId) {
        this.idHistory = idHistory;
        this.ppId = ppId;
    }

    public HistoryKey() {
        super();
    }

    public String getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(String idHistory) {
        this.idHistory = idHistory == null ? null : idHistory.trim();
    }

    public String getPpId() {
        return ppId;
    }

    public void setPpId(String ppId) {
        this.ppId = ppId == null ? null : ppId.trim();
    }
}