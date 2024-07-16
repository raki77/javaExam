/* profeel 2006 */

package com.example;
import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener 
{

	public void contextInitialized(ServletContextEvent event) {
		//여기에 디비 연결을 초기화하는 코딩을 합니다
		//그리고 이를 컨텍스트 속성에 저장합니다.

		ServletContext sc = event.getServletContext();
		String dogBreed = sc.getInitParameter("breed");

		Dog d = new Dog(dogBreed);
		sc.setAttribute("dog", d);

	}
	
	public void contextDestroyed(ServletContextEvent event) {
		//여기에 디비 연결을 닫는 코딩을 한다.
	}
}
