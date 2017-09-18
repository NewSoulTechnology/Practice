package com.self.json;

import java.util.HashMap;
import java.util.Map;

public class analyzeJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "{\"fans\":[{\"age\":7,\"name\":\"小王\"},{\"age\":10,\"name\":\"小尼玛\"}],\"name\":\"王尼玛\"}";
		anlayzeJson(string);
	}

	/**
	 * { "fans": [ { "age": 7, "name": "小王" }, { "age": 10, "name": "小尼玛" } ],
	 * "name": "王尼玛" }
	 * 
	 * @param string
	 */
	public static void anlayzeJson(String string) {
        Map<String, Object> map=new HashMap<String,Object>();
        
	}
}
