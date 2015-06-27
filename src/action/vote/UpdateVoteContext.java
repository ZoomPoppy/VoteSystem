package action.vote;

import action.rootaction.VoteContextRoot;
import enity.Votecontext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.List;
/**
 * Created by zz on 2015/6/24.
 */
public class UpdateVoteContext extends VoteContextRoot {
    private String mPublish;

    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        List<Votecontext> list = (List<Votecontext>) session.getAttribute("list");
        //list type publish voteId
        Votecontext votecontext = new Votecontext();
        for (int i = 0;i<context.length;i++){
            if (!context[i].equals(list.get(i))){
                votecontext.setVotecontextId(list.get(i).getVotecontextId());
                votecontext.setVoteId(list.get(i).getVoteId());
                votecontext.setContext(context[i]);
                votecontext.setCount(0);
                voteContextService.updateVoteContext(votecontext);
            }

        }
        return SUCCESS;
    }

}
