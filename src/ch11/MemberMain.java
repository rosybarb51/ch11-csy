package ch11;

public class MemberMain {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등함");
		}
		else {
			System.out.println("obj1과 obj2는 동등하지 않음");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등함");
		}
		else {
			System.out.println("obj1과 obj3은 동등하지 않음");
		}
	}
}

