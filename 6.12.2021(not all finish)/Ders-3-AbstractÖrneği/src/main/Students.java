package main;

public abstract class Students {

	private String name;
	private int no;
	
	public Students(String name, int no) {
		this.name = name;
		this.no = no;
	}
	
	public void sayName () {
		System.out.println("My Name: " + name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
}
