import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class MenuItem extends TagSupport {
	private String itemValue;
	
	public void setItemValue(String value) {
		itemValue = value;
	}
	
	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE;
	}
	
	public int doEndTag() throws JspException {
		Menu parent = (Menu) getParent();
		parent.addMenuItem(itemValue);
		return EVAL_PAGE;
	}
	
}