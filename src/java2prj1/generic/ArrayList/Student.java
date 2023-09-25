package java2prj1.generic.ArrayList;

public class Student {
	String name;
	String address;
	
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
	
}
