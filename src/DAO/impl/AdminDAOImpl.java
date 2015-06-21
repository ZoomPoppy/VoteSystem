package DAO.impl;

import DAO.AdminDAO;
import enity.Admin;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by zz on 2015/6/16.
 */
public class AdminDAOImpl extends HibernateDaoSupport implements AdminDAO {
    @Override
    public List<Admin> findAll() {
        return (List<Admin>)getHibernateTemplate().find("from Admin");
    }

    @Override
    public void addAdmin(Admin admin) {
        getHibernateTemplate().save(admin);
    }

    @Override
    public Admin findAdmin(String name, String password) {
        Object [] param =new String[]{name,password};
        String hql = "from Admin as admin where admin.name= ? and admin.password=?";
        List<Admin> list = (List<Admin>) getHibernateTemplate().find(hql,param);
        if (list!= null&&list.size()>0){
            return list.get(0);
        }
        else return null;
    }

    @Override
    public void changePassword(Admin admin) {
        getHibernateTemplate().update("password",admin);
    }

    @Override
    public void updateLoginTime(Admin admin) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
//        Session session = sessionFactory.openSession();
//        String datestring = admin.getLogintime();
//        String name = admin.getName();
//        session.createQuery("update Admin set logintime ='"+datestring+"'where name='"+name+"'");
          getHibernateTemplate().update(admin);
    }

    @Override
    public Admin findNameById(Integer adminid) {
        String hql = "from Admin as admin where admin.adminId=?";
        List<Admin> list = (List<Admin>) getHibernateTemplate().find(hql,adminid);
        if (list!= null&&list.size()>0){
            return list.get(0);
        }
        else return null;
    }

    @Override
    public Admin findAdminByName(String name) {
        String hql = "from Admin as admin where admin.name=?";
        List<Admin> list = (List<Admin>) getHibernateTemplate().find(hql,name);
        if (list!= null&&list.size()>0){
            return list.get(0);
        }
        else return null;
    }
}
