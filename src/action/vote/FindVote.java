package action.vote;

import DAO.VoteInfo;
import action.rootaction.VoteRoot;
import enity.Admin;
import enity.Vote;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by zz on 2015/6/19.
 */
//找到所有的vote
public class FindVote extends VoteRoot {
    @Override
    public String execute() throws Exception {
        List<Vote> list = new ArrayList();
        list = voteService.findVote();
        listInfo = new ArrayList();
        for (int i = 0; i<list.size();i++){
            Admin admin = adminService.findNameById(list.get(i).getAdminId());
            VoteInfo voteInfo = new VoteInfo();
            if (list.get(i).getPublish()==1){
                voteInfo.setPublish("开放投票");
            }
            else voteInfo.setPublish("关闭投票");
            if (list.get(i).getType()==1){
                voteInfo.setTitle("单选");
            }
            else voteInfo.setTitle("多选");
            voteInfo.setTitle(list.get(i).getTitle());
            voteInfo.setVoteId(list.get(i).getVoteId());
            voteInfo.setVoteId(list.get(i).getAdminId());
            voteInfo.setAdminname(admin.getName());
            voteInfo.setCreatedate(list.get(i).getCreatedate());
            listInfo.add(voteInfo);
        }
        setListInfo(listInfo);
        return SUCCESS;
    }
}
