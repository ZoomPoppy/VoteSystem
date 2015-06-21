package enity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zz on 2015/6/20.
 */
@Entity
public class Vote implements java.io.Serializable {
    private int mVoteId;
    private String mTitle;
    private String mCreatedate;
    private Integer mType;
    private Integer mPublish;
    private Integer mAdminId;

    @Id
    @Column(name = "vote_id", nullable = false, insertable = true, updatable = true)
    public int getVoteId() {
        return mVoteId;
    }

    public void setVoteId(int voteId) {
        mVoteId = voteId;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 50)
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Basic
    @Column(name = "createdate", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCreatedate() {
        return mCreatedate;
    }

    public void setCreatedate(String createdate) {
        mCreatedate = createdate;
    }

    @Basic
    @Column(name = "type", nullable = true, insertable = true, updatable = true)
    public Integer getType() {
        return mType;
    }

    public void setType(Integer type) {
        mType = type;
    }

    @Basic
    @Column(name = "publish", nullable = true, insertable = true, updatable = true)
    public Integer getPublish() {
        return mPublish;
    }

    public void setPublish(Integer publish) {
        mPublish = publish;
    }

    @Basic
    @Column(name = "admin_id", nullable = true, insertable = true, updatable = true)
    public Integer getAdminId() {
        return mAdminId;
    }

    public void setAdminId(Integer adminId) {
        mAdminId = adminId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vote vote = (Vote) o;

        if (mVoteId != vote.mVoteId) return false;
        if (mTitle != null ? !mTitle.equals(vote.mTitle) : vote.mTitle != null) return false;
        if (mCreatedate != null ? !mCreatedate.equals(vote.mCreatedate) : vote.mCreatedate != null) return false;
        if (mType != null ? !mType.equals(vote.mType) : vote.mType != null) return false;
        if (mPublish != null ? !mPublish.equals(vote.mPublish) : vote.mPublish != null) return false;
        if (mAdminId != null ? !mAdminId.equals(vote.mAdminId) : vote.mAdminId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mVoteId;
        result = 31 * result + (mTitle != null ? mTitle.hashCode() : 0);
        result = 31 * result + (mCreatedate != null ? mCreatedate.hashCode() : 0);
        result = 31 * result + (mType != null ? mType.hashCode() : 0);
        result = 31 * result + (mPublish != null ? mPublish.hashCode() : 0);
        result = 31 * result + (mAdminId != null ? mAdminId.hashCode() : 0);
        return result;
    }
}
