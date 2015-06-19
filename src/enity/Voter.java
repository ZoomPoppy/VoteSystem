package enity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zz on 2015/6/17.
 */
@Entity
public class Voter {
    private int mId;
    private Integer mVoteId;
    private String mIp;

    @Id
    @Column(name = "Id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    @Basic
    @Column(name = "vote_id", nullable = true, insertable = true, updatable = true)
    public Integer getVoteId() {
        return mVoteId;
    }

    public void setVoteId(Integer voteId) {
        mVoteId = voteId;
    }

    @Basic
    @Column(name = "Ip", nullable = true, insertable = true, updatable = true, length = 45)
    public String getIp() {
        return mIp;
    }

    public void setIp(String ip) {
        mIp = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voter voter = (Voter) o;

        if (mId != voter.mId) return false;
        if (mVoteId != null ? !mVoteId.equals(voter.mVoteId) : voter.mVoteId != null) return false;
        if (mIp != null ? !mIp.equals(voter.mIp) : voter.mIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mId;
        result = 31 * result + (mVoteId != null ? mVoteId.hashCode() : 0);
        result = 31 * result + (mIp != null ? mIp.hashCode() : 0);
        return result;
    }
}
