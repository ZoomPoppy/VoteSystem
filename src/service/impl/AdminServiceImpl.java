package service.impl;

import DAO.AdminDAO;
import enity.Admin;
import service.AdminService;

import java.util.List;

/**
 * Created by zz on 2015/6/17.
 */
public class AdminServiceImpl implements AdminService {
    private AdminDAO mAdminDAO;

    public AdminDAO getAdminDAO() {
        return mAdminDAO;
    }

    public void setAdminDAO(AdminDAO adminDAO) {
        mAdminDAO = adminDAO;
    }

    @Override
    public List<Admin> findAll() {
        return mAdminDAO.findAll();
    }

    @Override
    public void addAdmin(Admin admin) {
        mAdminDAO.addAdmin(admin);
    }

    @Override
    public Admin findAdmin(String name, String password) {
        return mAdminDAO.findAdmin(name,password);
    }

    @Override
    public void changePassword(Admin admin) {
        mAdminDAO.changePassword(admin);
    }

    @Override
    public void updateLoginTime(Admin admin) {
        mAdminDAO.updateLoginTime(admin);
    }

    @Override
    public Admin findNameById(Integer adminid) {
      return   mAdminDAO.findNameById(adminid);
    }

    @Override
    public Admin findAdminByName(String name) {
        return mAdminDAO.findAdminByName(name);
    }
}
