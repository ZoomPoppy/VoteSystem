package action.vote;

import DAO.VotingInfo;
import action.rootaction.VoteContextRoot;
import enity.Vote;
import enity.Votecontext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by zz on 2015/6/20.
 */
public class ShowVotingResult extends VoteContextRoot {
    @Override
    public String execute() {
        HttpSession session = ServletActionContext.getRequest().getSession();
        votingInfoList = new ArrayList();
        Integer vid = ((Vote)session.getAttribute("voting")).getVoteId();
        Long totalcount = voteContextService.findTotalCountByVoteId(vid);
        session.setAttribute("totalcount", totalcount);
        Vote vote = new Vote();
        vote.setVoteId(vid);
        List<Votecontext> list = voteContextService.findVoteContextByVoteId(vote);
        for (int i = 0;i<list.size();i++){
            Integer count = list.get(i).getCount();
            BigDecimal bd = new BigDecimal((double)count/totalcount);
            double per = bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
            NumberFormat percentFormat = NumberFormat.getPercentInstance();
            String percent = percentFormat.format(per);
            VotingInfo votingInfo = new VotingInfo();
            votingInfo.setContext(list.get(i).getContext());
            votingInfo.setCount(count);
            votingInfo.setPercent(percent);
            votingInfoList.add(votingInfo);
        }
        setVotingInfoList(votingInfoList);
        return SUCCESS;
    }
}
