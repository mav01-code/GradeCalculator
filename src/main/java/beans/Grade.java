package beans;

public class Grade {
	private int id;
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private double percentage;
	private String grade;
	
	public Grade() {
		// Non-parameterized constructor
	}
	public Grade(int id, String name, int sub1, int sub2, int sub3, double percentage, String grade) {
		// Parameterized constructor
		this.id = id;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.percentage = percentage;
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSub1() {
		return sub1;
	}
	
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	
	public int getSub2() {
		return sub2;
	}
	
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	
	public int getSub3() {
		return sub3;
	}
	
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	// Override toString method of Java - Prints data instead of memory address of an object's memory address
	public String toString() {
		return id + " " + name + " " + sub1 + " " + sub2 + " " + sub3 + " " + percentage + " " + grade;
	}
	
	// Override equals() method of Java 
	// Use case - when you want to check if book1.equals(book2) where book1 and book2 are objects,
	// returns false because the memory address of book1 and book2 are different. We compare
	// each parameter of an object with other and return 
	public boolean equals(Object o) {
		boolean flag = false;
		if(o instanceof Grade) {
			Grade g = (Grade)o;
			if(this.id == g.id && this.name.equals(g.name) && this.sub1 == g.sub1 && this.sub2 == g.sub2
					&& this.sub3 == g.sub3 && this.percentage == g.percentage && this.grade.equals(g.grade)) {
				flag = true;
			}
		}
		return flag;
	}
}
