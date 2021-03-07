package quiz01.MemberService;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import quiz01.Common.CommonService;

public class MemberServiceImpl implements MemberService{

	@Override
	public void MemberShip() {
		Stage memberStage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MemberShip.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		
		MemberController controller = loader.getController();
		controller.setRoot(root);
		
		memberStage.setScene(scene);
		memberStage.show();
	}

}
