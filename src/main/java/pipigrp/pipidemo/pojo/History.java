package pipigrp.pipidemo.pojo;

public class History extends HistoryKey {
    private String id;

    private String time;

    private String viewingTime;

    public History(String idHistory, String ppId, String id, String time, String viewingTime) {
        super(idHistory, ppId);
        this.id = id;
        this.time = time;
        this.viewingTime = viewingTime;
    }

    public History() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getViewingTime() {
        return viewingTime;
    }

    public void setViewingTime(String viewingTime) {
        this.viewingTime = viewingTime == null ? null : viewingTime.trim();
    }
}