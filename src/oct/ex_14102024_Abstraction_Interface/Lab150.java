package oct.ex_14102024_Abstraction_Interface;

public class Lab150 {
}
    interface I4{

        float PIE = 3.14f;


    }
    interface I5{}
    class A{}
    class B{}
    class Test1 extends A{} // Single
    //class Test2 extends A,B{ } // Multiple Never Possible using class
    class Test3 implements I4{ }
    class Test4 implements I4,I5{ } // Multiple Inheritance Interfaces
    class Test5 extends A implements I4,I5{ }
//class Test6 implements I1 extends A{ }

