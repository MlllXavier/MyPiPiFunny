package pipigrp.pipidemo.pojo;

public class Follow {
    private String idFollow;

    private String followerId;

    private String ppId;

    public Follow(String idFollow, String followerId, String ppId) {
        this.idFollow = idFollow;
        this.followerId = followerId;
        this.ppId = ppId;
    }

    public Follow() {
        super();
    }

    public String getIdFollow() {
        return idFollow;
    }

    public void setIdFollow(String idFollow) {
        this.idFollow = idFollow == null ? null : idFollow.trim();
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId == null ? null : followerId.trim();
    }

    public String getPpId() {
        return ppId;
    }

    public void setPpId(String ppId) {
        this.ppId = ppId == null ? null : ppId.trim();
    }
}