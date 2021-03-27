package pipigrp.pipidemo.pojo;

public class Comments {
    private Integer idComment;

    private String articleId;

    private Integer id;

    private String ppId;

    private String text;

    private String picturepath;

    private String videopath;

    private Integer likeCounts;

    public Comments(Integer idComment, String articleId, Integer id, String ppId, String text, String picturepath, String videopath, Integer likeCounts) {
        this.idComment = idComment;
        this.articleId = articleId;
        this.id = id;
        this.ppId = ppId;
        this.text = text;
        this.picturepath = picturepath;
        this.videopath = videopath;
        this.likeCounts = likeCounts;
    }

    public Comments() {
        super();
    }

    public Integer getIdComment() {
        return idComment;
    }

    public void setIdComment(Integer idComment) {
        this.idComment = idComment;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getLikeCounts() {
        return likeCounts;
    }

    public void setLikeCounts(Integer likeCounts) {
        this.likeCounts = likeCounts;
    }
}