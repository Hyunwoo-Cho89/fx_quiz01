package quiz01.LoginService;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginFunc {
	
	public void login(Parent root) {
		loginDisp();
	}
	
	public void loginDisp() {
		Stage loginStage = new Stage();		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));		
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root);
		
		loginStage.setScene(scene);	
		loginStage.show();
		
	}
	
	public void loginCancel() {
		
	}
}
