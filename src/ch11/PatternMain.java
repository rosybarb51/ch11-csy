package ch11;

import java.util.regex.Pattern;

public class PatternMain {

	public static void main(String[] args) {
//		정규식 패턴
		String regExp = "(051|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-1234"; // 실제 데이터
		boolean result = Pattern.matches(regExp, data);
		
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "abc@navercom";
		result = Pattern.matches(regExp, data);
		
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}












