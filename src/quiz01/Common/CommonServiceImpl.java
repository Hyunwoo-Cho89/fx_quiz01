package quiz01.Common;

import java.util.HashMap;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class CommonServiceImpl {
	private String id=null;
	private CommonDB db;
	private HashMap<String, CommonDB> map;
	
	public CommonServiceImpl() {
		map = new HashMap<String, CommonDB>();
	}
	public static void exit(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}
	
	public CommonDB DBSerch(String id) {
		this.id = id;
		System.out.println(id);
		//db = new CommonDB();
		db = map.get(this.id);
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
		System.out.println("찾았습니다.");
		return db;
	}
	
	public void DBSave(String id, CommonDB db) {	

		this.db = db;
		map.put(id, db);
		/*
		CommonDB db1 = map.get(id);
		System.out.println(db1.getName());
		System.out.println(db1.getPwd());
		System.out.println(db1.getGender());
		System.out.println(db1.getAge());
		for(int i = 0;i<db1.getHbList().size();i++) {
			System.out.println(db1.getHbList().get(i));
		}	
		*/
		System.out.println("저장되었습니다.");

	}
	
	public int idSerch(String id) {
		int result = 0;
		if(map.containsKey(id)) {
			result = 1;
		}else result = 0;
		
		return result;
	}
}
