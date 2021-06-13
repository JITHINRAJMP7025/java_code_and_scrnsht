package reverse;
class student{  
	  void display()
	  {
		  System.out.println("This is parent class");
	  }  
	}  
	class polymorphism extends student{  
	  void display()
	  {
		  System.out.println("This is child class");
	  }  
	  


	public static void main(String[] args) {
		
			    polymorphism poly = new polymorphism();
			    
			    poly.display();  
			  }  
			}  

