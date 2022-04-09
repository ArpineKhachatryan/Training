package Lesson1;

import java.util.Scanner;

public class usingGit {
    public static void main(String[] args) {
        String name ="Ara";
        String surname="Atayan";
        int age = 18;
        int includeAge = new Scanner(System.in).nextInt();
        double GPA=3.7;

        if (includeAge==age)
        {
            System.out.println( name+" "+ surname +" " +GPA);
        }
        else {
            System.out.println("Wrong age");
        }
    }
}
