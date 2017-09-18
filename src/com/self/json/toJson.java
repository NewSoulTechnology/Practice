package com.self.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class toJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(toJson());
	}
	/**
	 * {
     "name":"王尼玛",
     "fans":[{
     　　　　　"name":"小王",
     　　　　　"age":"7"
     　　　　　　},
                {
     　　　　　　"name":"小尼玛",
     　　　　　　"age":"10"
     　　　　　　}]
     　} 
	 * @param string
	 * @return
	 */
    public static String toJson(){
    	Map<String, Object> map1=new HashMap<String,Object>();
    	map1.put("name", "小王");
    	map1.put("age", 7);
    	Map<String, Object> map2=new HashMap<String,Object>();
    	map2.put("name", "小尼玛");
    	map2.put("age", 10);
    	List<Object> list=new ArrayList<Object>();
    	list.add(map1);
    	list.add(map2);
    	Map<String, Object> map=new HashMap<String,Object>();
    	map.put("name", "王尼玛");
    	map.put("fans", list);
    	//生成json格式的函数
    	Gson gson=new Gson();
    	String string=gson.toJson(map);
    	return string;
    }
}
