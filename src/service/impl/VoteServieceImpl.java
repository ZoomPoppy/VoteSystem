package service.impl;

import DAO.VoteDAO;
import enity.Vote;
import service.VoteService;

import java.util.List;

/**
 * Created by zz on 2015/6/17.
 */
public class VoteServieceImpl implements VoteService {
    private VoteDAO mVoteDAO;

    public VoteDAO getVoteDAO() {
        return mVoteDAO;
    }

    public void setVoteDAO(VoteDAO voteDAO) {
        mVoteDAO = voteDAO;
    }

    @Override
    public void addVote(Vote vote) {
        mVoteDAO.addVote(vote);
    }

    @Override
    public Integer findIdByTitle(Vote vote) {
        return mVoteDAO.findIdByTitle(vote);
    }

    @Override
    public List<Vote> findVote() {
        return mVoteDAO.findVote();
    }

    @Override
    public Vote findVoteById(Integer voteId) {
        return mVoteDAO.findVoteById(voteId);
    }

    @Override
    public void updateVote(Vote vote) {
        mVoteDAO.updateVote(vote);
    }

    @Override
    public List<Vote> findVoteByTitle(Vote vote) {
        return mVoteDAO.findVoteByTitle(vote);
    }

    @Override
    public Object findVoteCountByType(Integer type) {
        return mVoteDAO.findVoteCountByType(type);
    }

    @Override
    public Long findVoteCount() {
        return mVoteDAO.findVoteCount();
    }
}
