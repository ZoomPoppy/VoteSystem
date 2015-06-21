package action.rootaction;

import DAO.VoteInfo;
import com.opensymphony.xwork2.ActionSupport;
import service.AdminService;
import service.VoteService;

import java.util.List;
/**
 * Created by zz on 2015/6/19.
 */
public class VoteRoot extends ActionSupport {
    protected String title;
    protected String createdate;
    protected Integer voteId;
    protected Integer type;
    protected Integer publish;
    protected Integer adminId;
    protected VoteService voteService;
    protected Integer contextCount;
    protected List<VoteInfo> listInfo;
    protected AdminService adminService;

    public List<VoteInfo> getListInfo() {
        return listInfo;
    }

    public void setListInfo(List<VoteInfo> listInfo) {
        this.listInfo = listInfo;
    }

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    public Integer getContextCount() {
        return contextCount;
    }

    public void setContextCount(Integer contextCount) {
        this.contextCount = contextCount;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public Integer getPublish() {
        return publish;
    }

    public void setPublish(Integer publish) {
        this.publish = publish;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public VoteService getVoteService() {
        return voteService;
    }

    public void setVoteService(VoteService voteService) {
        this.voteService = voteService;
    }
}
