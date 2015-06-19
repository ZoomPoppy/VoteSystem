package service.impl;

import DAO.VoteContextDAO;
import enity.Vote;
import enity.Votecontext;
import service.VoteContextService;

import java.util.List;

/**
 * Created by zz on 2015/6/17.
 */
public class VoteContextServiceImpl implements VoteContextService {
    private VoteContextDAO mVoteContextDAO;

    public VoteContextDAO getVoteContextDAO() {
        return mVoteContextDAO;
    }

    public void setVoteContextDAO(VoteContextDAO voteContextDAO) {
        mVoteContextDAO = voteContextDAO;
    }

    @Override
    public void addVoteContext(Votecontext votecontext) {
        mVoteContextDAO.addVoteContext(votecontext);
    }

    @Override
    public List<Votecontext> findVoteContextByVoteId(Vote vote) {
        return mVoteContextDAO.findVoteContextByVoteId(vote);
    }

    @Override
    public void delVoteContext(Votecontext votecontext) {
        mVoteContextDAO.delVoteContext(votecontext);
    }

    @Override
    public void updateVoteContext(Votecontext votecontext) {
        mVoteContextDAO.updateVoteContext(votecontext);
    }

    @Override
    public void addOneVoteContext(Votecontext votecontext) {
        mVoteContextDAO.addOneVoteContext(votecontext);
    }

    @Override
    public Votecontext findVCCountByVCId(Votecontext votecontext) {
        return mVoteContextDAO.findVCCountByVCId(votecontext);
    }

    @Override
    public Long findTotalCountByVoteId(Integer voteId) {
        return mVoteContextDAO.findTotalCountByVoteId(voteId);
    }
}
