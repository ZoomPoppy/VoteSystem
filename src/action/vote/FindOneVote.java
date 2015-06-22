package action.vote;

import action.rootaction.VoteRoot;
import enity.Vote;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/6/22.
 */
public class FindOneVote extends VoteRoot {
    @Override
    public String execute() throws Exception {
        Vote vote2 = voteService.findVoteById(voteId);
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("vote",vote2);
        return SUCCESS;
    }
}
