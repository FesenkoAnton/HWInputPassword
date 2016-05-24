package inputPassword;

public class Tester {

	public static void main(String args[]) {

		UserPass up = new UserPass("l", "p",1);
		Password p = new Password(up);
		p.start();
	}
}
