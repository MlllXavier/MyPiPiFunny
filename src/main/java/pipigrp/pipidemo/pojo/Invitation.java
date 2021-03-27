package pipigrp.pipidemo.pojo;

public class Invitation {
    private String id;

    private String ppId;

    private String text;

    private String picturepath;

    private String videopath;

    private String time;

    private Integer numLike;

    private Integer numDislike;

    private Integer numComment;

    private Integer numTransport;

    private Integer isSend;

    private Integer checkState;

    public Invitation(String id, String ppId, String text, String picturepath, String videopath, String time, Integer numLike, Integer numDislike, Integer numComment, Integer numTransport, Integer isSend, Integer checkState) {
        this.id = id;
        this.ppId = ppId;
        this.text = text;
        this.picturepath = picturepath;
        this.videopath = videopath;
        this.time = time;
        this.numLike = numLike;
        this.numDislike = numDislike;
        this.numComment = numComment;
        this.numTransport = numTransport;
        this.isSend = isSend;
        this.checkState = checkState;
    }

    public Invitation() {
        super();
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getPicturepath() {
        return picturepath;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath == null ? null : picturepath.trim();
    }

    public String getVideopath() {
        return videopath;
    }

    public void setVideopath(String videopath) {
        this.videopath = videopath == null ? null : videopath.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getNumLike() {
        return numLike;
    }

    public void setNumLike(Integer numLike) {
        this.numLike = numLike;
    }

    public Integer getNumDislike() {
        return numDislike;
    }

    public void setNumDislike(Integer numDislike) {
        this.numDislike = numDislike;
    }

    public Integer getNumComment() {
        return numComment;
    }

    public void setNumComment(Integer numComment) {
        this.numComment = numComment;
    }

    public Integer getNumTransport() {
        return numTransport;
    }

    public void setNumTransport(Integer numTransport) {
        this.numTransport = numTransport;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public Integer getCheckState() {
        return checkState;
    }

    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }
}