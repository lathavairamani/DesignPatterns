package com.design.patterns.proxy.match.making;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler{
	
	PersonBean personBean;
	
	public OwnerInvocationHandler(PersonBean personBean) {
		// TODO Auto-generated constructor stub
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		try {
			if (method.getName().startsWith("get")){
				return method.invoke(personBean, args);
			} else if (method.getName().startsWith("setHotOrNotRating")) {
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(personBean, args);
			}
		} catch(InvocationTargetException ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
