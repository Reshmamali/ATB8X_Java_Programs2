package Task.ex_task_11th_oct;

public class APIAutomationRunner {
    public static void main(String[] args) {
        BaseTest b1 = new TestCaseAPI();
        b1.addid(22);
        b1.addname("Reshma Mali");
        System.out.println(b1.getName());
        b1.performGET();
        b1.performPATCH();
    }

}
