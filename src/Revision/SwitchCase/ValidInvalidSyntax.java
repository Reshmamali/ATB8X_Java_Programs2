package Revision.SwitchCase;

public class ValidInvalidSyntax {
        public static void main(String[] args) {
            char ch = 'A'; // 65
            switch (ch) {
            }

//        boolean b = true;
//        switch (b) {
//        }


            long a11 = 30l;
            switch ((int) a11) {
            }

            int a = 98;
            switch (a){
                case 98:
                    System.out.println("98");
//            case 98:
//                System.out.println("98");    // duplicate case is not allowed
            }
        }
    }

