package Task.ex_task_11th_oct;

public class BaseTest {
    private String name; // Name of the API user
    private int id;      // ID associated with the API user

    // Default constructor
    BaseTest(){
        System.out.println("BaseTestAPI: Default Constructor");
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
        this.addname("Reshma");

    }

    // Method overloading
    String addname(String name){
        System.out.println("this is the method overloading function 1");
        return name;
    }

    int addid (int id){
        System.out.println("this is the method overloading function 2");
        return id;
    }

    // Method for performing GET operation
    public void performGET() {
        System.out.println("BaseTestAPI: Performing GET operation");
    }

    // Method for performing POST operation
    public void performPOST() {
        System.out.println("BaseTestAPI: Performing POST operation");
    }

    // Method for performing PUT operation
    public void performPUT() {
        System.out.println("BaseTestAPI: Performing PUT operation");
    }

    // Method for performing DELETE operation
    public void performDELETE() {
        System.out.println("BaseTestAPI: Performing DELETE operation");
    }

    // Method for performing PATCH operation
    public void performPATCH() {
        System.out.println("BaseTestAPI: Performing PATCH operation");
    }
}
