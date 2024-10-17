package Task.ex_task_11th_oct;

public class TestCaseAPI extends BaseTest{

    TestCaseAPI(){
        super.getName();
        System.out.println(super.addid(30)); //
        System.out.println(super.addname("reshma"));;
        System.out.println("DC : called child constructor");
//        this.addname("Sharad");
    }

    @Override
    String addname(String name) {
        return super.addname(name);
    }
}
