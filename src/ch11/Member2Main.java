package ch11;

public class Member2Main {

//	얕은 복사 진행
	public static void main(String[] args) {
		Member2 ori = new Member2("blue", "홍길동", "12345", 25, true);
		ori.test[0] = "00";
		ori.test[1] = "11";
		ori.test[2] = "22";
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + ori.id);
		System.out.println("name : " + ori.name);
		System.out.println("password : " + ori.password);
		System.out.println("age : " + ori.age);
		System.out.println("adult : " + ori.adult);
		System.out.println("test : " + ori.test[0]);
		
		System.out.println();
		
//		얕은 복사를 사용하였기 때문에 멤버 변수 중 배열은 그대로 복사하지 못하고 배열의 주소만 복사해 감
		Member2 copy = ori.getMember();
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : " + copy.id);
		System.out.println("name : " + copy.name);
		System.out.println("password : " + copy.password);
		System.out.println("age : " + copy.age);
		System.out.println("adult : " + copy.adult);
		System.out.println("test : " + copy.test[0]);
		
		copy.password = "67890";
		ori.test[0] = "0000";
		
		System.out.println("---- 변경 후 ----");
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + ori.id);
		System.out.println("name : " + ori.name);
		System.out.println("password : " + ori.password);
		System.out.println("age : " + ori.age);
		System.out.println("adult : " + ori.adult);
		System.out.println("test : " + ori.test[0]);
		
		System.out.println();
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : " + copy.id);
		System.out.println("name : " + copy.name);
		System.out.println("password : " + copy.password);
		System.out.println("age : " + copy.age);
		System.out.println("adult : " + copy.adult);
		System.out.println("test : " + copy.test[0]);
		
	}

}
