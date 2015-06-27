package action.vote;

import action.rootaction.VoteRoot;
import enity.Admin;
import enity.Vote;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

/**n
 * Created by zz on 2015/6/19.
 */
public class newVote extends VoteRoot {
    public static final String ADDVOTEERROR = "addVoteError";
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        Vote vote = new Vote();
        vote.setTitle(title);
        vote.setAdminId(((Admin) session.getAttribute("admin")).getAdminId());
        vote.setType(type);
        vote.setPublish(publish);
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString  = format.format(date);
        vote.setCreatedate(dateString);
        List<Vote> list = voteService.haveSameTitle(vote);
        if (title.equals("")||contextCount==null){
            return ADDVOTEERROR;

        }
        if (list!=null){
            addActionError(getText("voteExist"));
            return ADDVOTEERROR;
        }
        else {
            session.setAttribute("vote",vote);
            session.setAttribute("contextCount",contextCount);
            return SUCCESS;
        }
    }
}
