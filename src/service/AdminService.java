package service;

import enity.Admin;

import java.util.List;

/**
 * Created by zz on 2015/6/17.
 */
public interface AdminService {
    public List<Admin> findAll();
    public void addAdmin(Admin admin);
    public Admin findAdmin(String name,String password);
    public void changePassword(Admin admin);
    public void updateLoginTime(Admin admin);
    public Admin findNameById(Integer adminid);
    public Admin findAdminByName(String name);
}
