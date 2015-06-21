package action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import enity.Admin;

import java.util.Map;
/**
 * Created by zz on 2015/6/19.
 */
public class SessionInterceptor extends AbstractInterceptor {
    private static final Object LOGIN_KEY = "admin";
    private static final String LOGIN_PAGE = "loginPage";
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map session = actionInvocation.getInvocationContext().getSession();
        Admin admin = (Admin)session.get(LOGIN_KEY);
        if (admin!=null){
            return actionInvocation.invoke();
        }
        else return LOGIN_PAGE;
    }
}
