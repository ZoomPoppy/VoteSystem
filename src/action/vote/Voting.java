package action.vote;

import action.rootaction.VoteRoot;
import enity.Vote;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/6/20.
 */
public class Voting extends VoteRoot {
    @Override
    public String execute() throws Exception {
        Vote voting  = voteService.findVoteById(voteId);
        if (voting.getPublish()==1){
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("voting",voting);
            return SUCCESS;
        }
        return ERROR;
    }
}
