package quiz01.LoginService;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import quiz01.MemberService.MemberController;

public class LoginServiceImpl implements LoginService{
	@Override
	
	public void login(Parent root) {				
		LoginController controller = new LoginController();
		controller.setRoot(root);
		
	}
	
}
