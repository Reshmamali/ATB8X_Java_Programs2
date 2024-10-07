package Task;

public class Main_person {
    public static void main(String[] args) {
        Person_4th_Oct person1 = new Person_4th_Oct();

        Person_4th_Oct person2 = new Person_4th_Oct("Reshma", "Mali", 30);
        System.out.println(person2.first_name);
        System.out.println(person2.last_name);
        System.out.println(person2.age);

        Person_4th_Oct person3 = new Person_4th_Oct("Sharad", "Mali");
        System.out.println(person3.first_name);
        System.out.println(person3.last_name);
        System.out.println(person3.age);


        Person_4th_Oct person4 = new Person_4th_Oct("Reeva","Mali", 1);
        System.out.println(person4.first_name);
        System.out.println(person4.last_name);
        System.out.println(person4.age);

        new Person_4th_Oct();
    }
}
