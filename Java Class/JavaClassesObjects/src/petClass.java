
public class petClass {
	/*
	 * 1. Create a Pet Class with the following instance variables: 

		name (PRIVATE) 
		age (PRIVATE) 
		location (PRIVATE) 
		type (PRIVATE) 
		two constructors(empty, all attributes)
		Code to be able to access the following (Get Methods): 
		name, age, type 
		Code to be able to change (Set Methods): 
		name, age, location  
		
	 */
	
	private String name;
	private int age;
	private String location;
	private String type;

	petClass() {
		name = " ";
		age = 0;
		location = " ";
		type = " ";
	}
	
	petClass(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public static void main(String[] args) {
		petClass myPet = new petClass("Oliver", 2, "Phoenix", "poodle");
		System.out.println(myPet.location);
	}

}
