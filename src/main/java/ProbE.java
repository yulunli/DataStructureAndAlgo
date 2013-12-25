package main.java.concurrency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Team 2
 * Matt, Rebecca, Yulun
 */
public class ProbE {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<int[]>> cases = new ArrayList<ArrayList<int[]>>();

        int numComps = scanner.nextInt();
        while(scanner.hasNext()){
            ArrayList<int[]> computers = new ArrayList<int[]>();
            for(int i=0; i<numComps; i++){
                int[] dates = new int[3];
                dates[0] = scanner.nextInt();
                dates[1] = scanner.nextInt();
                dates[2] = scanner.nextInt();
                computers.add(dates);
            }
            cases.add(computers);
            numComps = scanner.nextInt();
            if(numComps == 0){
                break;
            }
        }
        int i =1;
        for(ArrayList<int[]> kase : cases){
            ArrayList<int[]> computers = kase;
            int numComputers = computers.size();
            int[] computer0 = computers.get(0);
            int step = computer0[2] - computer0[1];
            int year = computer0[0];
            int found = -1;
            do {
                boolean check = true;
                for (int[] computer : computers){
                    check = check&&(satisfiesComputer(year, computer));
                }
                if (check){
                    found = year;
                    break;
                }
                year+=step;
            } while (year<10000);

            if (found==-1){
                System.out.println("Case #"+(i++)+":");
                System.out.println("Unknown bugs detected.");
            }
            else {
                System.out.println("Case #"+(i++)+":");
                System.out.println("The actual year is "+year+".");
            }

            System.out.println();
        }
    }

    public static boolean satisfiesComputer(int year, int[] computer){
        return computer[0]==year%(computer[2]-computer[1])+computer[1];
    }

}