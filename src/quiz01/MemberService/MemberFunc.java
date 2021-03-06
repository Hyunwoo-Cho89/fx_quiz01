package quiz01.MemberService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import quiz01.Common.CommonDB;
import quiz01.Common.CommonServiceImpl;

	

public class MemberFunc {
	private CommonServiceImpl cs;
	private Parent root;
	private Parent root01 = null;
	String id;
	String name;
	String pwd;
	String pwdChk;
	String gender;
	String age;
	ArrayList<String> hbList = new ArrayList();
	CommonDB db;
	HashMap<String, CommonDB> map = new HashMap<String, CommonDB>();
	
	public void MemberSave(Parent root) {
		this.root = root;
		TextField txtId = (TextField)root.lookup("#txtId");
		TextField txtName = (TextField)root.lookup("#txtName");
		PasswordField txtPwd = (PasswordField)root.lookup("#txtPwd");
		PasswordField txtPwdChk = (PasswordField)root.lookup("#txtPwdChk");
		RadioButton rdoMan = (RadioButton)root.lookup("#rdoMan");
		RadioButton rdoWoman = (RadioButton)root.lookup("#rdoWoman");
		CheckBox chkMusic = (CheckBox)root.lookup("#chkMusic");
		CheckBox chkMovie = (CheckBox)root.lookup("#chkMovie");
		CheckBox chkSport = (CheckBox)root.lookup("#chkSport");
		ComboBox<String> comboAge = (ComboBox<String>)root.lookup("#comboAge");
		
		id = txtId.getText();
		name = txtName.getText();
		pwd = txtPwd.getText();
		pwdChk = txtPwdChk.getText();
		age = comboAge.getValue();
		hbList = new ArrayList();
		//취미 저장
		if(chkMusic.isSelected()) {
			hbList.add("음악");
		}if(chkMovie.isSelected()) {
			hbList.add("영화");
		}if(chkSport.isSelected()) {
			hbList.add("스포츠");
		}
		//성별 저장	
		if(rdoMan.isSelected()) {
			gender = "남성";
		}else gender = "여성";		
			
		String message=null;

		//콤보 박스 저장
		if(id==null) {
			message = "아이디를 입력하세요.";
		}else if(name==null) {
			message = "이름을 입력하세요.";
		}else if(pwd==null) {
			message = "비밀번호를 입력하세요";
		}else if(pwd.equals(pwdChk)!=true) {
			message = "비밀번호가 일치 하지 않습니다.";
		}else if(comboAge == null) {
			message = "연령대를 선택하세요.";
		}//else message = null;	
		
		//if(message!=null) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("error");
			alert.setHeaderText("입력 창");
			alert.setContentText(message);
			alert.show();
		//}else {
			db = new CommonDB();
			db.setId(id);
			db.setName(name);
			db.setPwd(pwd);
			db.setGender(gender);
			db.setAge(age);
			db.setHbList(hbList);
			map.put(id, db);
			memberReChk(id);
			cs.exit(root);
		//}
			
	}
	
	public void memberReChk(String id) {		
		Stage Memeberstage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("memberSucess.fxml"));
		root01 = null;
		try {
			root01 = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db = new CommonDB();
		db = map.get(id);
		/*
		db.getName();
		db.getPwd();
		db.getGender();
		db.getAge();
		db.getHbList();
		*/
		System.out.println(db.getName());
		System.out.println(db.getPwd());
		System.out.println(db.getGender());
		System.out.println(db.getAge());
		for(int i = 0;i<db.getHbList().size();i++) {
			System.out.println(db.getHbList().get(i));
		}	
		Scene scene = new Scene(root01);
		Memeberstage.setScene(scene);
		Memeberstage.show();
	}
	public void memberSucess() {
		cs.exit(root01);
	}
}
