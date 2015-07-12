package action.vote;

import action.rootaction.VoteContextRoot;
import enity.Votecontext;

/**
 * Created by zz on 2015/6/29.
 */
public class dealVoting extends VoteContextRoot {
    @Override
    public String execute() throws Exception {
        Votecontext votecontext;
        String voteContextList[] = context;
        for (int i = 0;i < voteContextList.length ;i++){
            votecontext = new Votecontext();
            votecontext.setVotecontextId(Integer.parseInt(voteContextList[i]));
            Votecontext vcontext = voteContextService.findVCCountByVCId(votecontext);
            int count = vcontext.getCount();
            count++;
            vcontext.setCount(count);
            voteContextService.updateVoteContext(vcontext);

        }
        return SUCCESS;
    }
}

