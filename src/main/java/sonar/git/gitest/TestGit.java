package sonar.git.gitest;

public class TestGit {
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
