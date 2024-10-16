package Task.ex_task_14th_Oct;

public class PrintMyBook extends Book{

    PrintMyBook(String name, String authorName, int Price){
        super.authorName = authorName;
        super.name = name;
        super.Price = Price;
        this.getDetails();
    }
    @Override
    void getDetails() {
        System.out.println("These are book details");
        System.out.println(name+" "+authorName+" "+Price);
    }
}


