package com.design.patterns.proxy.match.making;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTest {
	HashMap<String, PersonBean> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchMakingTest matchMaking = new MatchMakingTest();
		matchMaking.drive();
	}
	
	public MatchMakingTest() {
		initializeDatabase();
	}
	
	private void initializeDatabase() {
		// TODO Auto-generated method stub
		PersonBean joel = new PersonBeanImpl();
		joel.setName("Joel");
		joel.setGender("Male");
		joel.setInterests("Reading, Running");
		joel.setHotOrNotRating(2);
		map.put(joel.getName(), joel);
		
		PersonBean brittany = new PersonBeanImpl();
		brittany.setName("Brittany");
		brittany.setGender("Female");
		brittany.setInterests("Reading, Listening Music");
		brittany.setHotOrNotRating(2);
		map.put(brittany.getName(), brittany);
	}
	
	private PersonBean getPersonFromDatabase(String name) {
		return map.get(name);
	}

	public void drive() {
		PersonBean joel = getPersonFromDatabase("Joel");
		PersonBean ownerProxy = getOwnerProxy(joel);
		ownerProxy.setInterests("Bowling");
		System.out.println("Interests set from owner property");
		try {
			ownerProxy.setHotOrNotRating(3);
		} catch(Exception ex) {
			System.out.println("Cant set this property ");
		}
		PersonBean nonOwnerProxy = getNonOwnerProxy(joel);
		nonOwnerProxy.setHotOrNotRating(5);
		System.out.println("Rating set" + joel.getHotOrNotRating());
		try {
			nonOwnerProxy.setInterests("Bowling");
		} catch(Exception ex) {
			System.out.println("Cant set this property ");
		}
	}
	
	public PersonBean getOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
	}
	
	public PersonBean getNonOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
	}

}
