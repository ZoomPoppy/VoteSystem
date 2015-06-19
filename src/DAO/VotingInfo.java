package DAO;

import java.lang.Integer;import java.lang.String; /**
 * Created by zz on 2015/6/16.
 */
public class VotingInfo implements java.io.Serializable{
    private String context;
    private Integer count;
    private String percent;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
}
