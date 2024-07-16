import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class Menu extends TagSupport {
	
	private ArrayList items;
	
	public void addMenuItem(String item) {
		items.add(item);
	}
	
	public int doStartTag() throws JspException {
		
		items = new ArrayList();
		
		return EVAL_BODY_INCLUDE;
	}
	
	public int doEndTag() throws JspException {
		
		try{
			pageContext.getOut().println("Menu items are: " + items);
		}catch(Exception ex) {
			throw new JspException("Exception:" + ex.toString());			
		}
		// 복잡한 메뉴를 만드는 코드가 여기 들어간다고 생각해보세요.
		return EVAL_PAGE;
	}
}