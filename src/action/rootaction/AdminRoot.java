package action.rootaction;

import com.opensymphony.xwork2.ActionSupport;
import service.AdminService;
import service.VoteService;

/**
 * Created by zz on 2015/6/17.
 */
public class AdminRoot extends ActionSupport {
    protected String name;
    protected String password;
    protected String newpwd1;
    protected String newpwd2;
    protected AdminService adminService;
    protected VoteService voteService;

    public VoteService getVoteService() {
        return voteService;
    }

    public void setVoteService(VoteService voteService) {
        this.voteService = voteService;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewpwd1() {
        return newpwd1;
    }

    public void setNewpwd1(String newpwd1) {
        this.newpwd1 = newpwd1;
    }

    public String getNewpwd2() {
        return newpwd2;
    }

    public void setNewpwd2(String newpwd2) {
        this.newpwd2 = newpwd2;
    }
}
