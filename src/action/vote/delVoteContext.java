package action.vote;

import action.rootaction.VoteContextRoot;
import enity.Votecontext;

/**
 * Created by zz on 2015/6/24.
 */
public class delVoteContext extends VoteContextRoot {
    @Override
    public String execute() throws Exception {
        Integer vote_Id = voteId;
        Integer votecontext_Id = voteContextId;
        Votecontext votecontext = new Votecontext();
        votecontext.setVotecontextId(votecontext_Id);
        votecontext.setVoteId(vote_Id);
        voteContextService.delVoteContext(votecontext);
        return SUCCESS;
    }
}
