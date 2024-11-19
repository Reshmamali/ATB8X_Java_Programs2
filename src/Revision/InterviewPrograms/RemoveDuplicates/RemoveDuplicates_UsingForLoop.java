package Revision.InterviewPrograms.RemoveDuplicates;

public class RemoveDuplicates_UsingForLoop {
    public static void main(String[] args) {
// In the first step, we have to convert the string into a character array.
// Traverse all the characters present in the character array.
// Check whether the str[i] is present before or not. If it is not present before,
// add it to the result.

        String a="reshma sharad mali";
        char b[]=a.toCharArray();
        int count=0;

        for(int i=0;i<=b.length-1;i++){
            count=1;
            for(int j=i+1;j<=b.length-1;j++){
                if(b[i]==b[j] && b[i]!=' '){
                    count++;
                    b[j]=0;
                    break;
                }
            }
            if(count>1&&b[i]!=0){
                System.out.print(b[i]+" ");

            }
        }
        System.out.println();
        System.out.println(b);
    }
}


