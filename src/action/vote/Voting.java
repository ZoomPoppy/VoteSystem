package action.vote;

import action.rootaction.VoteContextRoot;
import enity.Votecontext;

/**
 * Created by zz on 2015/6/20.
 */
public class Voting extends VoteContextRoot {
    @Override
    public String execute() throws Exception {
        Votecontext votecontext;
        String vc[] = context;
        for (int i = 0;i<vc.length;i++){
            votecontext = new Votecontext();
            votecontext.setVotecontextId(Integer.parseInt(vc[i]));
            Votecontext votecontext1 = voteContextService.findVCCountByVCId(votecontext);
            Integer count = votecontext1.getCount();
            String vccountext = votecontext1.getContext();
            votecontext1.setCount(count+1);
            voteContextService.updateVoteContext(votecontext1);
        }
        return SUCCESS;
    }
}
