package inputPassword;

public class UserPass {

	private String password;
	private String login;

	private String inPassword = "";
	private String inLogin = "";

	UserPass(String log, String pass) {
		inPassword = pass;
		inLogin = log;
	}

	UserPass(String log, String pass, int i) {
		password = pass;
		login = log;
	}

	UserPass() {

		inPassword = "";
		inLogin = "";
	}

	public String getInPassword() {
		return inPassword;
	}

	public String getInLogin() {
		return inLogin;
	}

	public boolean checkPassLog(UserPass u) {
		if ((login.compareTo(u.getInLogin()) == 0)
				&& (password.compareTo(u.getInPassword()) == 0)) {
			return true;
		} else {
			return false;
		}
	}
}
