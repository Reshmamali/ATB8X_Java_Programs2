package Nov.ex_04112024;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab214_Map_P2 {
    public static void main(String[] args) {
        HashMap<String, String> stud1 = new HashMap();
        stud1.put("name", "Reshma");
        stud1.put("roll_no", "1");
        stud1.put("Phone_no", "9878675645");
        System.out.println(stud1);

        HashMap<String, String> stud2 = new HashMap();
        stud2.put("name", "Sharad");
        stud2.put("roll_no", "2");
        stud2.put("Phone_no", "8978675645");
        System.out.println(stud2);

        HashMap<String, String> stud3 = new HashMap();
        stud3.put("name", "Reeva");
        stud3.put("roll_no", "3");
        stud3.put("Phone_no", "7867564534");
        System.out.println(stud3);

        List students = new ArrayList();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        System.out.println(students);

    }
}
