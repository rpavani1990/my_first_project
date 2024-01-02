package javaexamples;

public class Student_marks {
	public static void main (String args[]) {
		int marks=35;
		if (marks<35) {
			System.out.println("fail");
			
		}
		else if (marks>=35&& marks<45){
		    System.out.println("d grade");
		}
		 else if (marks>=45 && marks<60){ 
			 System.out.println("c grade ");
			
		 }   
		 else if (marks>=60 && marks <70) {
			 System.out.println( "b grade ");
		 }
		 else if (marks >=70 && marks<85) {
			 System.out.println("A grade");
		 }
		 else if (marks>=85 && marks<=100) {
			 System.out.println("o grade");
		 }
		 else {
			 System.out.println("invalied");
		 }
		
	}
	

}
