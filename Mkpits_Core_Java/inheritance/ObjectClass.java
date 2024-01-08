package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ObjectClass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ChildClass obj = new ChildClass();

        System.out.println("Enter first name:");
        obj.fname = br.readLine();
        while (obj.fname.isBlank()) {
            System.out.println("Invalid name! Please enter name");
            obj.fname = br.readLine();
        }

        System.out.println("Enter last name:");
        obj.lname = br.readLine();
        while (obj.lname.isBlank()) {
            System.out.println("Please enter last name");
            obj.lname = br.readLine();
        }
        System.out.println("Enter email:");
        obj.email = br.readLine();
        while (obj.email.isBlank() || !obj.email.contains("@")) {
            if (obj.email.isBlank()) {
                System.out.println("Please enter email; it cannot be blank");
            } else if (!obj.email.contains("@")) {
                System.out.println("Email must contain the '@' symbol");
            }

            System.out.println("Enter email:");
            obj.email = br.readLine();
        }


        System.out.println("Enter mobile number:");
        obj.mob = br.readLine();
        while (!obj.mob.matches("\\d{10}")) {
            System.out.println("Mobile number must have 10 digits and contain only numbers:");
            obj.mob = br.readLine();
        }

        while (obj.mob.isEmpty()) {
            System.out.println("Please enter mobile number");
            obj.mob = br.readLine();

            if (!obj.mob.matches("\\d{10}")) {
                System.out.println("Mobile number must have 10 digits and contain only numbers:");
                obj.mob = br.readLine();
            }
        }

        System.out.println("Enter gender (f/m):");
        obj.g = br.readLine();
        while (!obj.g.equalsIgnoreCase("f") && !obj.g.equalsIgnoreCase("m")) {
            System.out.println("Enter valid choice (f/m):");
            obj.g = br.readLine();
        }

        System.out.println("Enter pincode:");
        obj.pinCode = br.readLine();
        while (!obj.pinCode.matches("\\d{6}")) {
            System.out.println("Pincode must have 6 digits and contain only numbers:");
            obj.pinCode = br.readLine();
        }

        obj.getDetails();
    }
}
