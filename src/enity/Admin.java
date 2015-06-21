package enity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zz on 2015/6/20.
 */
@Entity
public class Admin implements java.io.Serializable{
    private int mAdminId;
    private String mName;
    private String mPassword;
    private String mLogintime;

    @Id
    @Column(name = "admin_id", nullable = false, insertable = true, updatable = true)
    public int getAdminId() {
        return mAdminId;
    }

    public void setAdminId(int adminId) {
        mAdminId = adminId;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Basic
    @Column(name = "password", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    @Basic
    @Column(name = "logintime", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLogintime() {
        return mLogintime;
    }

    public void setLogintime(String logintime) {
        mLogintime = logintime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (mAdminId != admin.mAdminId) return false;
        if (mName != null ? !mName.equals(admin.mName) : admin.mName != null) return false;
        if (mPassword != null ? !mPassword.equals(admin.mPassword) : admin.mPassword != null) return false;
        if (mLogintime != null ? !mLogintime.equals(admin.mLogintime) : admin.mLogintime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mAdminId;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mPassword != null ? mPassword.hashCode() : 0);
        result = 31 * result + (mLogintime != null ? mLogintime.hashCode() : 0);
        return result;
    }
}
