package oct.ex_27102024_Arrays;

public class Lab195_RightTrangle_star_pattern {
    //*
    //**
    //***
    //****
    //*****

    public static void main(String[] args) {
       int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
