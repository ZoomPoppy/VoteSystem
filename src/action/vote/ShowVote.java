package action.vote;

import action.rootaction.VoteContextRoot;
import enity.Vote;
import enity.Votecontext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zz on 2015/6/22.
 */
public class ShowVote extends VoteContextRoot {
    private static final String SHOWVOTE = "showvote";

    @SuppressWarnings("unchecked")
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        // 从session中获得投票信息
        Vote vote = (Vote) session.getAttribute("vote");
        // 通过投票编号查找投票子选项信息并赋给list
        List<Votecontext> list = voteContextService.findVoteContextByVoteId(vote);
        map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).getVotecontextId(), list.get(i).getContext());
        }
        setMap(map);
        // 将存有投票子选项信息的list存入session的“list”
        session.setAttribute("list", list);
        // 将投票类型，状态发送到对应页面
        // setFlag(flag);
        setType(vote.getType());
        return SHOWVOTE;
    }

}
