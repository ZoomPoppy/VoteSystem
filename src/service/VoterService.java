package service;

import enity.Voter;

/**
 * Created by zz on 2015/6/17.
 */
public interface VoterService {
    public void addVoter(Voter voter);
    public Voter findVoterByIp(String ip,Integer voteId);
    public void delVoterByVoteId(Integer voteId);

}
