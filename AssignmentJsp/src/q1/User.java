package q1;

public class User {
 String Firstname;
 String Surname;
 String loginname;
 int age;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String firstname, String surname, String loginname, int age) {
	super();
	Firstname = firstname;
	Surname = surname;
	this.loginname = loginname;
	this.age = age;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getSurname() {
	return Surname;
}
public void setSurname(String surname) {
	Surname = surname;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "User [Firstname=" + Firstname + ", Surname=" + Surname + ", loginname=" + loginname + ", age=" + age + "]";
}
 
	
	
}
