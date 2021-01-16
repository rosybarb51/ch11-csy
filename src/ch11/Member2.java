package ch11;

public class Member2 implements Cloneable {
	public String id; // String 참조 타입이나 기본 타입처럼 사용됨
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public String[] test; // 배열은 참조 타입
	
	public Member2(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		
		test = new String[3];
	}
	
	public Member2 getMember() {
		Member2 cloned = null;
		
		try {
//			Object 클래스의 멤버 메서드인 clone()이 실행
//			clone()메서드는 반환타입이 Object 타입이기 때문에 Member2 클래스 타입으로 강제 타입 변환함
			cloned = (Member2)clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
}
