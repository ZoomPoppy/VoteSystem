package DAO;

import enity.Vote;
import java.util.*;
/**
 * Created by zz on 2015/6/16.
 */
public interface VoteDAO {
    public void addVote(Vote vote);
    public Integer findIdByTitle(Vote vote);
    public List<Vote> findVote();
    public Vote findVoteById(Integer voteId);
    public void updateVote(Vote vote);
    public List<Vote> findVoteByTitle(Vote vote);
    public Object findVoteCountByType(Integer type);
    public Long findVoteCount();
    public List<Vote> haveSameTitle(Vote vote);
}
