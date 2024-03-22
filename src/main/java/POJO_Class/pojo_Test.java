package POJO_Class;

public class pojo_Test { 
	
	    public static void main(String[] args) {  
	   
	 pojo_pom obj= new pojo_pom(); 
	 
	obj.setName("Alisha"); // Setting the values using the set() method  
	obj.setId("A001");  
	obj.setSal(200000);  
	System.out.println("Name: "+ obj.getName()); //Getting the values using the get() method  
	System.out.println("Id: " + obj.getId());  
	System.out.println("Salary: " +obj.getSal());  
	
	    }  
	}  

