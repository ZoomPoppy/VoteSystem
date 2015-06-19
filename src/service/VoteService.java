package service;

import enity.Vote;

import java.util.List;

/**
 * Created by zz on 2015/6/17.
 */
public interface VoteService {
    public void addVote(Vote vote);
    public Integer findIdByTitle(Vote vote);
    public List<Vote> findVote();
    public Vote findVoteById(Integer voteId);
    public void updateVote(Vote vote);
    public List<Vote> findVoteByTitle(Vote vote);
    public Object findVoteCountByType(Integer type);
    public Long findVoteCount();
}
