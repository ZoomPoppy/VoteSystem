package DAO;

import enity.Vote;
import enity.Votecontext;
import java.util.*;
/**
 * Created by zz on 2015/6/16.
 */
public interface VoteContextDAO {
    public void addVoteContext(Votecontext votecontext);
    public List<Votecontext> findVoteContextByVoteId(Vote vote);
    public void delVoteContext(Votecontext votecontext);
    public void updateVoteContext(Votecontext votecontext);
    public void addOneVoteContext(Votecontext votecontext);
    public Votecontext findVCCountByVCId(Votecontext votecontext);
    public Long findTotalCountByVoteId(Integer voteId);
}
