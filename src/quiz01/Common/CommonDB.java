package quiz01.Common;

import java.util.ArrayList;

public class CommonDB {
	private String id;
	private String name;
	private String pwd;
	private String pwdChk;
	private String gender;
	private String age;
	private ArrayList<String> hbList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwdChk() {
		return pwdChk;
	}
	public void setPwdChk(String pwdChk) {
		this.pwdChk = pwdChk;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public ArrayList<String> getHbList() {
		return hbList;
	}
	public void setHbList(ArrayList<String> hbList) {
		this.hbList = hbList;
	}
	
	
}
