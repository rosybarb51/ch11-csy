package ch11;

import java.util.Properties;
import java.util.Set;

public class GetPropertyMain {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈디렉토리 : " + userHome);
		
		System.out.println("----------------");
		System.out.println(" [ key ]   value");
		System.out.println("----------------");
		
//		Properties : HashMap 과 비슷한 데이터 타입, key와 value로 구성되어 있는 데이터 타입
		Properties props = System.getProperties();
//		Set : 배열과 비슷한 형태의 데이터 타입, 중복된 데이터를 저장할 수 없음
		Set keys = props.keySet();
		
//		향상된 for 문을 사용하여 Set 타입의 변수 keys에 저장된 정보를 하나씩 출력함
		for (Object objkey : keys) {
//			keys에서 꺼내온 정보를 문자열 타입으로 강제 타입변환
			String key = (String)objkey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ] " + value);
		}
		
		System.out.println("\n----- 환경 변수 읽기 -----\n");
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[ JAVA_HOME ] " + javaHome);
		String classPath = System.getenv("CLASSPATH");
		System.out.println("[ CLASSPATH ] " + classPath);
	}

}
