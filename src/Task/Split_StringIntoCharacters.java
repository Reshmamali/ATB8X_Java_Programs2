package Task;

public class Split_StringIntoCharacters {
    public static void main(String[] args) {
        String a="pranali gadakh";
        String []b=a.split(" ");

        for(int j=0;j<=b.length;j++){
            for(int i=b[j].length()-1;i>=0;i--)
            {
                System.out.print(b[j].charAt(i));
            }
            System.out.print(" ");//for blank line
            }
        }
    }

