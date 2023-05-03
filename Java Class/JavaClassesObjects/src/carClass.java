
public class carClass {
	
	/*
	 * 2. Create a Custom Class (anything you want - car, phone, holiday, etc.). 

		Requirements: 
		
		Minimum 3 private instance variables 
		An empty constructor 
		A constructor that uses only 2 of your 3 variables
		A constructor that uses all 3 of your instance variables 
		Get methods for all 3 of your instance variables and 
			Set methods for all 3 of your instance variables 
		A method that returns a Boolean 
		A method that returns a String 
			(For example, if I created a Santa Custom Class, 
			my code would look something like the attached Santa.java 
			file. 	 
	 */

	private String make;
	private String model;
	private static int year;
	
	carClass() {
		make = " ";
		model = " ";
		year = 0;
	}
	
	carClass(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	carClass(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
	        return "Car{" +
	                "make='" + make + '\'' +
	                ", model='" + model + '\'' +
	                ", year=" + year +
	                '}'; 
	}
	 
	public static boolean isCarNew() {
		 return year >= 2023;
	} 
	
	public static void main(String[] args) {
		carClass vehicle = new carClass("Ford", "Mustang", 2016);
		System.out.println(vehicle);
		System.out.println(isCarNew());
	}
 
}
