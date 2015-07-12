package DAO.impl;

import DAO.VoterDAO;
import enity.Voter;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import java.util.*;
/**
 * Created by zz on 2015/6/16.
 */
public class VoterDAOImpl extends HibernateDaoSupport implements VoterDAO {
    @Override
    public void addVoter(Voter voter) {
        getHibernateTemplate().save(voter);
    }

    @Override
    public Voter findVoterByIp(String ip, Integer voteId) {
        Object param[] = {ip, voteId};
        String hql = "from Voter as voter where voter.ip = ? and voter.voteId=?";
        List<Voter> list = (List<Voter>) getHibernateTemplate().find(hql, param);
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else return null;
    }

    @Override
    public void delVoterByVoteId(Integer voteId) {
        getSessionFactory().openSession().createQuery("delete  from Voter where voteId="+voteId+"").executeUpdate();
    }
}
