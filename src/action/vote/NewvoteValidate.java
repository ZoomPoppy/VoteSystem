package action.vote;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class NewvoteValidate extends ActionSupport {
	private final static String TITLENULL = "titleerror";
	private final static String CCOUNTNULL = "counterror";
	private String title;
	private Integer contextcount;

	public Integer getContextcount() {
		return contextcount;
	}

	public void setContextcount(Integer contextcount) {
		this.contextcount = contextcount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("contextCount",contextcount);
		if (title == null){
			return TITLENULL;
		}
		if (contextcount == null){
			return CCOUNTNULL;
		}
		return SUCCESS;
	}
}
