package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter: ");
            String a = scanner.nextLine();

            if (a==null) {
                throw new NullPointerException("it is empty");
            }

int b=Integer.valueOf(a);
            System.out.println(b);
        } catch (NumberFormatException numberFormatException) {
            System.err.println("ERROR!!!  it is invalid");

        } catch (NullPointerException nullPointerException) {
            System.err.println("ERROR!!!  null entry made.");

        } catch (Exception exception) {
            System.err.println("ERROR!!! Another error happened");
        }

    }
}
