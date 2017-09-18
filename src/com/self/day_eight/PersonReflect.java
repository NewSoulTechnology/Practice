package com.self.day_eight;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class PersonReflect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	//获取Class实例
			Class<?> cla=Class.forName("com.self.day_eight.Person");
			//获取Constructor实例
			//Constructor<?> con=cla.getConstructor(int.class,String.class);
			Constructor<?> con=cla.getConstructor(null);
			//实例化对象
			//Person per=(Person)con.newInstance(20,"zhangsan");
			Person per=(Person)con.newInstance(null);
			System.out.println(per);
			//获取Field实例(如果属性是私有的，则下列方法无效)
			Field[] fields=cla.getFields();
			for (Field field : fields) {
				System.out.println(field.getName());
				if(field.getName().startsWith("age")){
					field.setInt(per, 30);
				}
				if(field.getName().startsWith("name")){
					field.set(per, "huang");
				}
			}
			//获取Method实例
//			Method me=cla.getMethod("getAge", null);
//			System.out.println(me.invoke(per, null));
			Method[] mes=cla.getMethods();
			for (Method method : mes) {
				if(method.getName().startsWith("getAge")){
					System.out.println(method.invoke(per, null));
				}
				if(method.getName().startsWith("getName")){
					System.out.println(method.invoke(per, null));
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
