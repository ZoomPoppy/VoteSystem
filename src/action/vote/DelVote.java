package action.vote;

import action.rootaction.VoteContextRoot;
import enity.Vote;
import enity.Votecontext;
import java.util.*;
/**
 * Created by zz on 2015/6/27.
 */
public class DelVote extends VoteContextRoot{
    @Override
    public String execute() throws Exception {
        //voteid
        Vote vote = voteService.findVoteById(voteId);
        List<Votecontext> list = voteContextService.findVoteContextByVoteId(vote);
        for (int i = 0;i<list.size();i++){
            voteContextService.delVoteContext(list.get(i));
        }
        voteService.delVote(vote);
        return SUCCESS;
    }
}
