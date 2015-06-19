package service;

import enity.Vote;
import enity.Votecontext;

import java.util.List;

/**
 * Created by zz on 2015/6/17.
 */
public interface VoteContextService {
    public void addVoteContext(Votecontext votecontext);
    public List<Votecontext> findVoteContextByVoteId(Vote vote);
    public void delVoteContext(Votecontext votecontext);
    public void updateVoteContext(Votecontext votecontext);
    public void addOneVoteContext(Votecontext votecontext);
    public Votecontext findVCCountByVCId(Votecontext votecontext);
    public Long findTotalCountByVoteId(Integer voteId);
}
