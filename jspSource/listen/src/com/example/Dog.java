/* profeel 2006 */

package com.example;

import javax.servlet.http.*;

public class Dog implements HttpSessionBindingListener
{
	private String breed;

	public Dog(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}

	public void valueBound(HttpSessionBindingEvent event) {
		// ���ǿ� �߰��Ǿ��� �� ����� �ڵ�
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		// ���ǿ��� ���ŵǾ��� �� ����� �ڵ�
	}

}
