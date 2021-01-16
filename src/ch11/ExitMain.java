package ch11;

public class ExitMain {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
				else {
					System.out.println("프로그램 종료");
				}
			}
		});
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				System.exit(i);
			}
			catch (SecurityException e) {
				
			}
		}
		
//		return : return 키워드를 만나면 메서드가 즉시 종료
//		exit() : exit를 만나면 프로그램이 즉시 종료 
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				System.exit(0);
			}
		}
	}

}
