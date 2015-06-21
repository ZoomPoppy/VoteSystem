package action.vote;

import action.rootaction.VoteRoot;
import enity.Vote;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/6/20.
 */
public class ShowVoting extends VoteRoot {
    private static final String VOTECLOSE = "voteclose";
    @Override
    public String execute() throws Exception {
        Vote vote2 = voteService.findVoteById(voteId);
        if (vote2.getPublish()!=1){
            return VOTECLOSE;
        }
        else {
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("vote",vote2);
            return SUCCESS;
        }
    }
}
