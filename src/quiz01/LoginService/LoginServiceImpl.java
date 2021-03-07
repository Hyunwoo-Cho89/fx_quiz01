package quiz01.LoginService;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import quiz01.Controller01;
import quiz01.Common.CommonDB;
import quiz01.Common.CommonServiceImpl;
import quiz01.MemberService.MemberController;
import quiz01.MemberService.MemberFunc;
public class LoginServiceImpl extends Controller01 implements LoginService {
	Parent root;
	String id;
	String pwd;
	int result;
	CommonServiceImpl cs;
	CommonDB db;
	MemberFunc mf;
	public LoginServiceImpl(){
		//this.cs = cs;
	}
	@Override
	public void setRoot(Parent root) {
		this.root = root;		
		cs = new CommonServiceImpl();
		login();
		
	}
	@Override
	public void login() {
		db = new CommonDB();
		TextField txtId = (TextField)root.lookup("#txtId");
		PasswordField txtPwd = (PasswordField)root.lookup("#txtPwd");
		id = txtId.getText();
		pwd = txtPwd.getText();
		//System.out.println(id+"login");
		//System.out.println(pwd+"login");
		result = cs.idSerch(id);;
		if(result == 1) {
			db = super.cs.DBSerch(id);
			if(pwd.equals(db.getPwd())) {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("로그인 알림");
				alert.setHeaderText("알림");
				alert.setContentText("로그인 성공");
				alert.show();				
				cs.exit(root);	
			}else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("로그인 에러");
				alert.setHeaderText("알림");
				alert.setContentText("비밀번호가 일치 하지 않습니다.");
				alert.show();
			}
			
		}else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("로그인 에러");
			alert.setHeaderText("알림");
			alert.setContentText("아이디가 존재하지 않습니다.");
			alert.show();
		}
	}			
		
		
		
}
