package action.rootaction;

import com.opensymphony.xwork2.ActionSupport;
import service.VoterService;

/**
 * Created by zz on 2015/6/22.
 */
public class VoterRoot extends ActionSupport {
    protected String ip;
    protected VoterService voterService;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public VoterService getVoterService() {
        return voterService;
    }

    public void setVoterService(VoterService voterService) {
        this.voterService = voterService;
    }
}
