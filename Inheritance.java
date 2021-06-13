package reverse;
class student1 {
    String name;
    int age;
     }

class inheritance extends student1 {
  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Age " + age);
  }
}

class mainclass {
  public static void main(String[] args) {
    inheritance details = new inheritance();
    details.name = "amal";
    details.age=12;
    details.display();
 }
}