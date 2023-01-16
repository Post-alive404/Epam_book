package by.epam.learn.data;

import java.util.Scanner;

public class TrashMain {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        int numbers;
        while (scanner.hasNextInt()){
            numbers = scanner.nextInt();
            if(numbers==0) break;
        }
    }
}
