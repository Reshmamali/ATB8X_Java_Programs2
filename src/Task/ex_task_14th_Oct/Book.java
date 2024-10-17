package Task.ex_task_14th_Oct;

abstract class Book {

    protected String name;
    protected String authorName;
    protected int Price;

    Book(String name, String authorName, int Price){
        this.authorName = authorName;
        this.name = name;
        this.Price = Price;

    }
    abstract void getDetails();
}
