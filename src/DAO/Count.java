package DAO;

import java.lang.Long; /**
 * Created by zz on 2015/6/16.
 */
//投票类型 分为 单选投票 和 多选投票
public class Count implements java.io.Serializable{
    private Long singleCount;
    private Long multiCount;
    private Long allCount;

    public Long getAllCount() {
        return allCount;
    }

    public void setAllCount(Long allCount) {
        this.allCount = allCount;
    }

    public Long getMultiCount() {
        return multiCount;
    }

    public void setMultiCount(Long multiCount) {
        this.multiCount = multiCount;
    }

    public Long getSingleCount() {
        return singleCount;
    }

    public void setSingleCount(Long singleCount) {
        this.singleCount = singleCount;
    }
}
