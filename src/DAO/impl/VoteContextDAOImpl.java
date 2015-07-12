package DAO.impl;

import DAO.VoteContextDAO;
import enity.Vote;
import enity.Votecontext;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by zz on 2015/6/16.
 */
public class VoteContextDAOImpl extends HibernateDaoSupport implements VoteContextDAO{

    @Override
    public void addVoteContext(Votecontext votecontext) {
        getHibernateTemplate().save(votecontext);
    }

    @Override
    public List<Votecontext> findVoteContextByVoteId(Vote vote) {
        Integer vote_id = vote.getVoteId();
        String hql = "from Votecontext as voteContext where voteContext.voteId=?";
        List<Votecontext> list = (List<Votecontext>) getHibernateTemplate().find(hql,vote_id);
        return list;
    }

    @Override
    public void delVoteContext(Votecontext votecontext) {
        getHibernateTemplate().delete(votecontext);
    }

    @Override
    public void updateVoteContext(Votecontext votecontext) {
        getHibernateTemplate().update(votecontext);
    }

    @Override
    public void addOneVoteContext(Votecontext votecontext) {
        getHibernateTemplate().save(votecontext);
    }

    @Override
    public Votecontext findVCCountByVCId(Votecontext votecontext) {
        Integer vcId = votecontext.getVotecontextId();
        String hql = "from Votecontext as voteContext where voteContext.votecontextId=?";
        List<Votecontext> list = (List<Votecontext>) getHibernateTemplate().find(hql,vcId);
        return list.get(0);
    }

    @Override
    public Long findTotalCountByVoteId(Integer voteId) {
        String sql = "select sum(voteContext.count) from Votecontext as voteContext where voteContext.voteId=?";
        List list = getHibernateTemplate().find(sql,voteId);
        return (Long)list.get(0);
    }
}
