package Revision.ForLoop;

public class PrintAtoZcharacters {
    public static void main(String[] args) {
        for (char ch = 'a'; ch<='z'; ch++){
            System.out.println(ch);
            if(ch=='p'){
                break;
            }
        }
    }
}
