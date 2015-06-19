package DAO;

import enity.Voter;

/**
 * Created by zz on 2015/6/16.
 */
public interface VoterDAO {
    public void addVoter(Voter voter);
    public Voter findVoterByIp(String ip,Integer voteId);
}
