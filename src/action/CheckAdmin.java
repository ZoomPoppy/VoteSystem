package action;

import action.rootaction.VoteRoot;
import enity.Admin;
import enity.Vote;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/7/5.
 */
public class CheckAdmin extends VoteRoot {
    public static final String DELSUCCESS="delsuccess";
    public static final String EDITSUCCESS="editsucces";
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        Admin nowAdmin = (Admin) session.getAttribute("admin");
        Vote vote = voteService.findVoteById(voteId);
        Integer voteAdminId = vote.getAdminId();
        Integer now_id = nowAdmin.getAdminId();
        if (voteAdminId==now_id){
            if (flag==1) return EDITSUCCESS;
            else return DELSUCCESS;
        }
        else return ERROR;
    }
}
