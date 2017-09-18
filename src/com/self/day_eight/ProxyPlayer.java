package com.self.day_eight;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyPlayer implements InvocationHandler{
    //代理角色
	private Object realobject;
	
	public ProxyPlayer(Object realobject) {
		this.realobject = realobject;
	}
    
	public void proxyDoSomething_A(){
		System.out.println("i want to do something A");
	}

	public void proxyDoSomething_B(){
		System.out.println("i want to do something B");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		proxyDoSomething_A();
		method.invoke(realobject, args);
		proxyDoSomething_B();
		return null;
	}
}
