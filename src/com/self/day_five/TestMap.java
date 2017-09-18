package com.self.day_five;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "张三");
		map.put("age", 20);
//		Set<String> set = map.keySet();
//		Iterator iterator = set.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			System.out.println(map.get(iterator.next()));
//		}
//
//		Collection collection = map.values();
//		Iterator iterator2 = collection.iterator();
//		while (iterator2.hasNext())
//			System.out.println(iterator2.next());

		Set<Map.Entry<String, Object>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Object>> it = entrySet.iterator();
		while (it.hasNext()) {
			Entry<String, Object> entry = it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	// }
}
