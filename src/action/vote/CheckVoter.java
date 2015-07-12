package action.vote;

import action.rootaction.VoterRoot;
import enity.Vote;
import enity.Voter;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/6/22.
 */

public class CheckVoter extends VoterRoot {

    @Override
    public String execute() throws Exception {

        HttpSession session = ServletActionContext.getRequest().getSession();
        Vote vote = (Vote) session.getAttribute("voting");
        Integer vote_id = vote.getVoteId();
        String ip = ServletActionContext.getRequest().getRemoteAddr();
        Voter voter = voterService.findVoterByIp(ip,vote_id);
        if (voter==null) {
            Voter voter1 = new Voter();
            voter1.setIp(ip);
            voter1.setVoteId(vote_id);
            voterService.addVoter(voter1);
            return SUCCESS;
        }
        else return ERROR;
    }
}
