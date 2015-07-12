package action.login;

import action.rootaction.AdminRoot;
import enity.Admin;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by zz on 2015/7/4.
 */
public class ChangePswd extends AdminRoot{
    public static final String OLDPSWDERROR="oldpassworderror";
    public static final String NEWPASSWORDERROR="newpassworderror";
    @Override
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        Admin nowAdmin = (Admin) session.getAttribute("admin");
        String nowPswd = nowAdmin.getPassword();
        if (nowPswd.equals(password)){
            if (newpwd1.equals(newpwd2)){
                nowAdmin.setPassword(newpwd1);
                adminService.changePassword(nowAdmin);
                return SUCCESS;
            }
            return NEWPASSWORDERROR;
        }
        else return OLDPSWDERROR;
    }
}
