package quiz01.MemberService;

import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import quiz01.Common.CommonServiceImpl;

public class MemberController {
	private Parent root;
	private CommonServiceImpl cs;
	
	public void setRoot(Parent root) {
		this.root = root;
		addComboBox(this.root);
	}
	public void addComboBox(Parent root) {
		ComboBox<String> comboAge = (ComboBox<String>)root.lookup("#comboAge");
		comboAge.getItems().addAll("10대이하","10대","20대","30대","40대","50대","60대이상");
	}
	public void memberClose() {
		cs.exit(root);
	}
	
	public void memberSucess() {
		
		MemberFunc func = new MemberFunc();
		func.MemberSave(root);
	}
	
	
}
