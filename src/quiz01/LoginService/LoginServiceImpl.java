package quiz01.LoginService;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import quiz01.MemberService.MemberController;

public class LoginServiceImpl implements LoginService{
	Parent root;
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
		
		login();
		
	}
	@Override
	public void login() {
		
	}			
		
		
		
}
