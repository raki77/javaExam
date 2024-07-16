/* profeel 2006 */

package com.example;
import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener 
{

	public void contextInitialized(ServletContextEvent event) {
		//���⿡ ��� ������ �ʱ�ȭ�ϴ� �ڵ��� �մϴ�
		//�׸��� �̸� ���ؽ�Ʈ �Ӽ��� �����մϴ�.

		ServletContext sc = event.getServletContext();
		String dogBreed = sc.getInitParameter("breed");

		Dog d = new Dog(dogBreed);
		sc.setAttribute("dog", d);

	}
	
	public void contextDestroyed(ServletContextEvent event) {
		//���⿡ ��� ������ �ݴ� �ڵ��� �Ѵ�.
	}
}
