package Revision.InterviewPrograms;

public class ReverseStringWithoutChangingState {
    public static void main(String[] args) {
        String str = "Reshma Sharad Mali";
        String []str2 =str.split(" ");

        for (int i = 0; i<str2.length; i++){
            for (int j = str2[i].length()-1 ; j >=0; j-- ){
                System.out.print(str2[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
