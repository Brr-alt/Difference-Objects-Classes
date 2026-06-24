// A CLASS is like a blueprint. Basically, just providing the design of the Submarine.
//It does not exist as a real thing yet. 

class Submarine {

//These are VARIABLES
//The class defines them but does not fill them in
//These don't have values yet.
	
	String name; 
	int crewSize; 
	String status; 

//This is the CONSTRUCTOR. 
//This is called when we create an object from the class. 
//It takes in data and stores it into that specific object. 
	
	Submarine(String name, int crewSize, String status) {

//"this." means this specific object being created. 
		this.name = name; 
		this.crewSize = crewSize; 
		this.status = status; 
	}

//This is a METHOD. It defines something every submarine object can do
//void means it just prints and does not return anything
	void displayInfo() {
		System.out.println("Submarine: " + name); 
		System.out.println("Crew Size: " + crewSize); 
		System.out.println("Status: " + status); 
		System.out.println("======================================"); 
	}	
}

//This is the MAIN CLASS that runs the program
public class Main {

	public static void main(String[] args) {
		
//OBJECTS are created here using the Submarine class as the blueprint.
//The word "new" is what builds the object in memory.
//Each one is its own independent object with its own data.

//Submarine 1 (Object 1) 
Submarine sub1 = new Submarine("USS Newport News (SSN-750)", 130, "Deployed"); 

//Submarine 2 (Object 2) same class, but different object and data.
Submarine sub2 = new Submarine("USS Alexandria (SSN-757)", 132, "Under Maintenance"); 

//Submarine 3 (Object 3) same class, different object too and data.
Submarine sub3 = new Submarine("USS Georgia (SSGN-729)", 200, "Deployed");

//Calling the same method on each object
//Each one prints its own data even though they use the same method 
//This shows that object are independent of each other. 

sub1.displayInfo(); 
sub2.displayInfo(); 
sub3.displayInfo(); 

//The class (Submarine) was written once
//The objects (sub1, sub2, sub3) were each built from one class

	}

}
