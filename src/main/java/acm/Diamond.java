package main.java.acm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("./in"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            sc.close();
        }
    }
}
