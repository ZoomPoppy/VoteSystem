package action;

import action.rootaction.VoterRoot;
import enity.Vote;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/7/5.
 */
public class UpdateVoter extends VoterRoot{
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        Vote vote = (Vote) session.getAttribute("vote");
        voterService.delVoterByVoteId(vote.getVoteId());
        return SUCCESS;
    }
}
