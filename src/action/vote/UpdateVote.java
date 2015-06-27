package action.vote;

import action.rootaction.VoteRoot;
import enity.Vote;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/6/24.
 */
public class UpdateVote extends VoteRoot {
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        Vote vote = (Vote) session.getAttribute("vote");
        if (vote.getType().equals(type) && vote.getPublish().equals(publish)) {
            return SUCCESS;
        } else {
            vote.setType(type);
            vote.setPublish(publish);
            voteService.updateVote(vote);
            return SUCCESS;
        }
    }
}
