package clientpkg;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        Copil copil = new Copil(12, 230, "Dan");

        System.out.println(copil.getAge());
        System.out.println(copil.toString());
        System.out.println();
    }
}
