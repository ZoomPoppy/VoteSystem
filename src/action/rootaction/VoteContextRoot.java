package action.rootaction;

import DAO.VotingInfo;
import com.opensymphony.xwork2.ActionSupport;
import service.VoteContextService;
import service.VoteService;

import java.util.List;
import java.util.Map;
/**
 * Created by zz on 2015/6/19.
 */
public class VoteContextRoot extends ActionSupport {
    protected Integer voteContextId;//
    protected String[] context;
    protected VoteContextService voteContextService;
    protected Integer voteId;
    protected VoteService voteService;
    protected Map map;
    protected Integer type;
    protected List<VotingInfo> votingInfoList;
    protected Integer publish;

    public Integer getPublish() {
        return publish;
    }

    public void setPublish(Integer publish) {
        this.publish = publish;
    }

    public List<VotingInfo> getVotingInfoList() {
        return votingInfoList;
    }

    public void setVotingInfoList(List<VotingInfo> votingInfoList) {
        this.votingInfoList = votingInfoList;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String[] getContext() {
        return context;
    }

    public void setContext(String[] context) {
        this.context = context;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Integer getVoteContextId() {
        return voteContextId;
    }

    public void setVoteContextId(Integer voteContextId) {
        this.voteContextId = voteContextId;
    }

    public VoteContextService getVoteContextService() {
        return voteContextService;
    }

    public void setVoteContextService(VoteContextService voteContextService) {
        this.voteContextService = voteContextService;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public VoteService getVoteService() {
        return voteService;
    }

    public void setVoteService(VoteService voteService) {
        this.voteService = voteService;
    }
}
