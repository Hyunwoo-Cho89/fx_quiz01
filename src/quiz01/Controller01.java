package quiz01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import quiz01.Common.CommonServiceImpl;
import quiz01.LoginService.LoginServiceImpl;
import quiz01.MemberService.MemberFunc;
import quiz01.MemberService.MemberServiceImpl;

public class Controller01 implements Initializable{
	private Parent root;
	private LoginServiceImpl ls;
	private MemberServiceImpl ms;
	private MemberFunc mf;
	protected CommonServiceImpl cs;
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		ls = new LoginServiceImpl();
		ms = new MemberServiceImpl();

	}
	
	public void loginProc() {
		ls.setRoot(root);
	}
	
	public void cancelProc() {
		cs.exit(root);
	}

	public void memberShipProc() {	
		ms.MemberShip();

	}
}
