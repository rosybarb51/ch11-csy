package ch11;

import java.util.HashMap;

public class KeyMain {

	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<String, String>();
//		
//		map.put("1", "아이유");
//		map.put("2", "유인나");
//		map.put("3", "정인선");
//		
//		System.out.println(map.get("1"));
//		System.out.println(map.get("2"));
//		System.out.println(map.get("3"));
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		
		hashMap.put(k1, "홍길동");
		
		String value = hashMap.get(k2);
		
//		hashMap.put(new Key(1), "홍길동");
//		
//		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
//		Object obj = new Object();
//		System.out.println(obj);
//		System.out.println(obj.hashCode());
	}

}
