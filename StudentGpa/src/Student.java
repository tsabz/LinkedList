import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
	// initialize variables
	private String name;
	private String address;
	private Double GPA;
	static LinkedList<Student> studentList = new LinkedList<Student> ();
	static Scanner scanner = new Scanner(System.in);
	
	// constructor method
	public Student(String name, String address, Double GPA) {
		this.name = name;
		this.address = address;
		this.GPA = GPA;
	}
	
	// Getters and Setters name, address GPA
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String fullName) {
		this.name = fullName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String fullAddress) {
		this.address = fullAddress;
	}
	
	public Double getGPA() {
		return GPA;
	}
	
	public void setGPA(Double studentGPA) {
		this.GPA = studentGPA;
	}
	
	// Student Summary 
	
	public void StudetSummary() throws IOException{
		FileWriter fw = new FileWriter("StudentGPA.txt",true);
		PrintWriter out = new PrintWriter(fw);
		
		System.out.println("Student Summary");
		System.out.println("");
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.println("Please enter the student's name: ");
			String name = scanner.next();
			
			System.out.println("Please enter the student's address: ");
			String address = scanner.next();
			
			System.out.println("Please enter the student's GPA: ");
			Double GPA = scanner.nextDouble();
			
			studentList.add(new Student(name, address, GPA));
			
		} 		
		
        Collections.sort(studentList, new SortName());
        
        for (int i = 0; i < studentList.size(); i++)
        	out.println(studentList.get(i));
        	out.close();
       

	}
	
    @Override
    public String toString() {
        String str = "Name: " + getName() + "\nAddress: " + getAddress() + "\nGPA: " + getGPA()+ "\n\n";
        return str;
    }
}
