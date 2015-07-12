package service.impl;

import DAO.VoterDAO;
import enity.Voter;
import service.VoterService;

/**
 * Created by zz on 2015/6/17.
 */
public class VoterServiceImpl implements VoterService {
    private VoterDAO mVoterDAO;

    public VoterDAO getVoterDAO() {
        return mVoterDAO;
    }

    public void setVoterDAO(VoterDAO voterDAO) {
        mVoterDAO = voterDAO;
    }

    @Override
    public void addVoter(Voter voter) {
        mVoterDAO.addVoter(voter);
    }

    @Override
    public Voter findVoterByIp(String ip, Integer voteId) {
        return mVoterDAO.findVoterByIp(ip,voteId);
    }

    @Override
    public void delVoterByVoteId(Integer voteId) {
        mVoterDAO.delVoterByVoteId(voteId);
    }
}
