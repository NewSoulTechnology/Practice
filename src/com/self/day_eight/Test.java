package com.self.day_eight;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AbstractPlayer abstractPlayer=new Player_2();//实际角色
       ProxyPlayer proxy=new ProxyPlayer(abstractPlayer);//代理角色
       AbstractPlayer player=(AbstractPlayer)Proxy.newProxyInstance(AbstractPlayer.class.getClassLoader(),
    		   new Class[]{AbstractPlayer.class}, proxy);
       player.speak();
	}

}
