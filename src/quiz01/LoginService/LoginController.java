package quiz01.LoginService;

import javafx.scene.Parent;

public class LoginController {
	private Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
		login();
	}
	
	public void login() {
		LoginFunc loginFunc = new LoginFunc();
		loginFunc.login(root);
	}
	
}
