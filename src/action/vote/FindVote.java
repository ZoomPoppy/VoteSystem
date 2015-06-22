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
//�ҳ����е�Vote
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
                voteInfo.setPublish(new String("ͶƱ����"));

            }
            else voteInfo.setPublish(new String("ͶƱ�ر�"));
            if (list.get(i).getType()==1){
                voteInfo.setType(new String("��ѡ"));
            }
            else voteInfo.setType(new String("��ѡ"));
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
