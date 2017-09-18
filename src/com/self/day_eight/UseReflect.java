package com.self.day_eight;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class UseReflect {
        public static void main(String[] args) {
			try {
				//传入的String是完成的路径名    包名+类名
				Class<?> class1=Class.forName("com.self.day_eight.Person");
				//使用newInstance() 实例化对象
				Person person1=(Person) class1.newInstance();
				//获取目标类中的声明的方法
				Method[] methods=class1.getDeclaredMethods();
				//获取目标类中的声明的属性
				Field[] fields=class1.getDeclaredFields();
				//getModifiers   获取权限修饰(对象是什么，就获取对应的修饰权限)
				StringBuffer stringBuffer=new StringBuffer();
				stringBuffer.append(Modifier.toString(class1.getModifiers())+" class {\n");
				for (Field field : fields) {
					stringBuffer.append("\t");//空格  
					//获得属性的修饰符，例如public，static等等  
	                stringBuffer.append(Modifier.toString(field.getModifiers())+" ");
	                //getType   获取修饰属性的数据类型
	                stringBuffer.append(field.getType().getSimpleName() + " ");  
	                //getName   获取属性名
	                stringBuffer.append(field.getName()+";\n");//属性的名字+回车  
	            }  
				for (Method method : methods) {
					stringBuffer.append("\t");
					stringBuffer.append(Modifier.toString(method.getModifiers())+" ");
					stringBuffer.append(method.getTypeParameters()+" ");
					stringBuffer.append(method.getName()+";\n");//属性的名字+回车
				}
	            stringBuffer.append("}");  
				System.out.println(stringBuffer);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
