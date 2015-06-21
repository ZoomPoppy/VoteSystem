import action.rootaction.AdminRoot;
import enity.Admin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * Created by zz on 2015/6/19.
 */
public class CreatAdmin extends AdminRoot{
    private static final String CREATEADMINERROR = "createAdminError";
    @Override
    public String execute() throws Exception {
        Admin admin = adminService.findAdminByName(name);
        if (admin!=null){
            addActionError(getText("adminexist"));
            return CREATEADMINERROR;
        }
        else{
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = format.format(date);
            Admin admin1 = new Admin();
            admin1.setName(name);
            admin1.setLogintime(dateString);
            admin1.setPassword(newpwd1);
            adminService.addAdmin(admin1);
            return SUCCESS;
        }
    }
}
