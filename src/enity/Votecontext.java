package enity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zz on 2015/6/17.
 */
@Entity
public class Votecontext {
    private int mVotecontextId;
    private String mContext;
    private Integer mCount;
    private Integer mVoteId;

    @Id
    @Column(name = "votecontext_id", nullable = false, insertable = true, updatable = true)
    public int getVotecontextId() {
        return mVotecontextId;
    }

    public void setVotecontextId(int votecontextId) {
        mVotecontextId = votecontextId;
    }

    @Basic
    @Column(name = "context", nullable = true, insertable = true, updatable = true, length = 50)
    public String getContext() {
        return mContext;
    }

    public void setContext(String context) {
        mContext = context;
    }

    @Basic
    @Column(name = "Count", nullable = true, insertable = true, updatable = true)
    public Integer getCount() {
        return mCount;
    }

    public void setCount(Integer count) {
        mCount = count;
    }

    @Basic
    @Column(name = "vote_id", nullable = true, insertable = true, updatable = true)
    public Integer getVoteId() {
        return mVoteId;
    }

    public void setVoteId(Integer voteId) {
        mVoteId = voteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Votecontext that = (Votecontext) o;

        if (mVotecontextId != that.mVotecontextId) return false;
        if (mContext != null ? !mContext.equals(that.mContext) : that.mContext != null) return false;
        if (mCount != null ? !mCount.equals(that.mCount) : that.mCount != null) return false;
        if (mVoteId != null ? !mVoteId.equals(that.mVoteId) : that.mVoteId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mVotecontextId;
        result = 31 * result + (mContext != null ? mContext.hashCode() : 0);
        result = 31 * result + (mCount != null ? mCount.hashCode() : 0);
        result = 31 * result + (mVoteId != null ? mVoteId.hashCode() : 0);
        return result;
    }
}
