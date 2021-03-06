package action.vote;

import DAO.VoteInfo;
import action.rootaction.VoteRoot;
import enity.Admin;
import enity.Vote;
import java.util.*;
/**
 * Created by zz on 2015/6/19.
 */
public class SearchVote extends VoteRoot {
    private static final String SEARCHNULL = "searchnull";
    @Override
    public String execute() throws Exception {
        Vote vote = new Vote();
        vote.setTitle(title);
        List<Vote> list = voteService.findVoteByTitle(vote);
        if (list == null){
            addActionError(getText("NOVALIDVOTE"));
            return SEARCHNULL;
        }
        else {
            listInfo = new ArrayList();
            for (int i = 0;i<list.size();i++){
                Admin admin = adminService.findNameById(list.get(i).getAdminId());
                VoteInfo voteInfo = new VoteInfo();
                if (list.get(i).getPublish()==1){
                    voteInfo.setPublish("开放投票");
                }
                else voteInfo.setPublish("关闭投票");
                if (list.get(i).getType()==1){
                    voteInfo.setType("单选");
                }
                else voteInfo.setType("多选");
                voteInfo.setTitle(list.get(i).getTitle());
                voteInfo.setVoteId(list.get(i).getVoteId());
                voteInfo.setAdminname(admin.getName());
                voteInfo.setCreatedate(list.get(i).getCreatedate());
                listInfo.add(voteInfo);
            }
            setListInfo(listInfo);
            return SUCCESS;
        }
    }
}
