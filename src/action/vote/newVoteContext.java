package action.vote;

import action.rootaction.VoteContextRoot;
import enity.Vote;
import enity.Votecontext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/6/19.
 */
public class newVoteContext extends VoteContextRoot {
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        Vote vote = (Vote) session.getAttribute("vote");
        voteService.addVote(vote);
        Integer vote_id = voteService.findIdByTitle(vote);
        Vote vote1 = voteService.findVoteById(vote_id);
        session.setAttribute("vote",vote1);
        String [] voteContext = context;
        for (int i = 0 ;i<voteContext.length;i++){
            Votecontext votecontext = new Votecontext();
            votecontext.setContext(voteContext[i]);
            votecontext.setVoteId(vote_id);
            votecontext.setCount(0);
            voteContextService.addVoteContext(votecontext);
        }
        return SUCCESS;
    }
}
