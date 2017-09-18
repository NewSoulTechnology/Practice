package com.self.day_four;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Aclass aclass=new Aclass();
            aclass.setName("张三");
            Bclass bclass=new Bclass();
            Use use=new Use();
            aclass.say();
            bclass.say();
            use.say(aclass);
            use.say(bclass);
	}

}
