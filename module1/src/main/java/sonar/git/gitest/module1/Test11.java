package sonar.git.gitest.module1;

public class Test11 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
