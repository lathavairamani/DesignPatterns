package com.design.patterns.proxy.match.making;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

PersonBean personBean;
	
	public NonOwnerInvocationHandler(PersonBean personBean) {
		// TODO Auto-generated constructor stub
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		try {
			if (method.getName().startsWith("setHotOrNotRating")) {
				return method.invoke(personBean, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("get")){
				throw new IllegalAccessException();
			} 
		} catch(InvocationTargetException ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
