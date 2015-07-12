package action.vote;

import action.rootaction.VoteContextRoot;
import enity.Vote;
import enity.Votecontext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.*;
/**
 * Created by zz on 2015/6/20.
 */
public class ShowVotingContext extends VoteContextRoot {
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        Vote vote = (Vote) session.getAttribute("voting");
        List<Votecontext> list = voteContextService.findVoteContextByVoteId(vote);
        map = new HashMap();
        for (int i = 0;i<list.size();i++){
            map.put(list.get(i).getVotecontextId(),list.get(i).getContext());
        }
        setMap(map);
        setType(vote.getType());
        return SUCCESS;
    }
}
