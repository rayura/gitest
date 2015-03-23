package sonar.git.gitest.module2;

public class TestGit2 {
	public static void main(String[] args) {
		try {
			throw new Exception();
			//11
		} catch (Exception e) {
		}
		try {
			throw new Exception();
		} catch (Exception e) {
		}
	}
}
