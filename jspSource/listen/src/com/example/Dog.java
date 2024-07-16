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
		// 세션에 추가되었을 때 실행될 코드
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		// 세션에서 제거되었을 때 실행될 코드
	}

}
