package ch11;

public class StringSplitMain {

	public static void main(String[] args) {
		String text = "홍길동,이수홍,박연수,김자바,최명호";
		String[] name = text.split(",");
		
		System.out.println(text);
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

}
