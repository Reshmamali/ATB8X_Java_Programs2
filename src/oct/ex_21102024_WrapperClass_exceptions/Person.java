package oct.ex_21102024_WrapperClass_exceptions;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        int result = 20;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("Reshma", 30);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode()); // prints the same number as p1

    }
}

