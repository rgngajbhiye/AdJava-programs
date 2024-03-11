package model;

public class reg {
private int id;
  private String fname;
  private String uname;
  private String email;
  private String pass;
  
  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

public reg() {
		super();
		
	}
  
  public reg( String fname, String uname, String email, String pass) {
		super();
	
		this.fname = fname;
		this.uname = uname;
		this.email = email;
		this.pass = pass;
	}
  
public reg(int id, String fname, String uname, String email, String pass) {
	super();
	this.id = id;
	this.fname = fname;
	this.uname = uname;
	this.email = email;
	this.pass = pass;
}
  
  
}
