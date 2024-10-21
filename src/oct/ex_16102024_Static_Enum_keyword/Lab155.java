package oct.ex_16102024_Static_Enum_keyword;

public class Lab155 {
        public static void main(String[] args) {
            ATB s1 = new ATB("Amit");
            ATB s2 = new ATB("Suraj");
            ATB s3 = new ATB("Tushar");
            ATB s4 = new ATB("Balam");

            ATB s5;
            new ATB("Pramod");

            s1.readDocuments();
            s2.readDocuments();

            ATB.doAssignment();

        }
    }

    class ATB{
        private String name;
        private String phone;
        static String courseName = "ATB8x";

        // Instance initialisation block
        {
            System.out.println("IIB");
            // What is the purpose? -
            // Here you can write code related to
            // start a website or anything before starting the
            // web automation or api automation
            //
            System.out.println("Reading from CSV file");
        }

        // Static initialisation block
        static {
            System.out.println("Load the class?, I will execute");
        }

////        //Getter and setter method
////        public String getName() {
////            return name;
////        }
//
//        public void setName(String name) {
//            this.name = name;
//        }

        // Parameterized constructor
        public ATB(String name) {
            this.name = name;
        }

        // normal method
        void readDocuments(){
            System.out.println("Non Static Method");
            System.out.println(courseName);
        }

        // Static method
        static void doAssignment(){
            // System.out.println(phone);
            System.out.println("Do Assignment");
        }

        // Static class
        static class GenAI{
            // 0.0001% in Automation
        }
    }

