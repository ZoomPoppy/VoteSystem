package DAO.impl;

import DAO.VoteDAO;
import enity.Vote;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by zz on 2015/6/16.
 */
public class VoteDAOImpl extends HibernateDaoSupport implements VoteDAO {
    @Override
    public void addVote(Vote vote) { //add 投票
        getHibernateTemplate().save(vote);
    }

    @Override
    public Integer findIdByTitle(Vote vote) {//by vote。title 找到 vote。id；
        String title = vote.getTitle();
        String hql = "from Vote as vote where vote.title=?";
        List<Vote> list = (List<Vote>) getHibernateTemplate().find(hql,title);
        return list.get(0).getVoteId();
    }

    @Override
    public List<Vote> findVote() {//找出所有投票
        List<Vote> list = (List<Vote>) getHibernateTemplate().find("from Vote");
        return list;
    }

    @Override
    public Vote findVoteById(Integer voteId) {//通过id找投票
        String hql = "from Vote as vote where vote.voteId=?";
        List<Vote> list = (List<Vote>) getHibernateTemplate().find(hql,voteId);
        return list.get(0);
    }

    @Override
    public void updateVote(Vote vote) {//更新投票信息
        getHibernateTemplate().update(vote);
    }

    @Override
    public List<Vote> findVoteByTitle(Vote vote) {//通过题目找打投票
        String title = vote.getTitle();
        String hql = "from Vote as vote where vote.title like '%"+title+"%'";
        List<Vote> list = (List<Vote>) getHibernateTemplate().find(hql);
        if (list!=null&&list.size()>0){
            return list;
        }
        return null;
    }

    @Override
    public Long findVoteCountByType(Integer type) {//通过投票类型找到 投票的个数
        String hql = "select count(*) from Vote as vote where vote.type=?";
        List list = getHibernateTemplate().find(hql,type);
        if (list!=null&&list.size()>0){
            return (Long) list.get(0);
        }
        return new Long(0);
    }

    @Override
    public Long findVoteCount() {//找出总共 投票的个数
        String hql = "select count(*) from Vote";
        List list = getHibernateTemplate().find(hql);
        if (list!=null&&list.size()>0){
            return (Long) list.get(0);
        }
        return new Long(0);
    }
}
