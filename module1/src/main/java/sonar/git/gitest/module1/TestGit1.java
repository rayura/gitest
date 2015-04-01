package sonar.git.gitest.module1;

public class TestGit1 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
		}
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			throw new Exception();
		} catch (Exception e) {
		}
	}
}
