package sonar.git.gitest.module1;

public class Test11 {
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace();
			e.printStackTrace();
		}
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace();
			e.printStackTrace();
			e.printStackTrace();
			e.printStackTrace();
		}
	}

}
