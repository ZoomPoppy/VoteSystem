package action.vote;

import action.rootaction.VoterRoot;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/6/22.
 */
public class CheckVoter extends VoterRoot {
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        return SUCCESS;
    }
}
