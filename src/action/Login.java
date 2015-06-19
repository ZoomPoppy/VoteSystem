package action;

import DAO.Count;
import action.rootaction.AdminRoot;
import enity.Admin;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**;
 * Created by zz on 2015/6/17.
 */
public class Login extends AdminRoot{
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
//        if (session.getAttribute("rand")==null){
//            return ERROR;
//        }
        Admin admin = adminService.findAdmin(name,password);
        if (admin == null){
            addActionError(getText("loginERROR"));
            return ERROR;
        }
        else {
            session.setAttribute("admin",admin);
            Count count = new Count();
            count.setSingleCount((Long) voteService.findVoteCountByType(new Integer(1)));
            count.setMultiCount((Long) voteService.findVoteCountByType(new Integer(0)));
            count.setAllCount(voteService.findVoteCount());
            session.setAttribute("count",count);
            //当前时间
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = format.format(date);
            admin.setLogintime(dateString);
           // adminService.updateLoginTime(admin);
            return SUCCESS;

        }
    }
}
