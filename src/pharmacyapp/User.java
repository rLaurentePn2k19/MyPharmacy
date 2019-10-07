/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class User implements UserTransaction {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private static List<Account> RegisteredPharmacists = new ArrayList<Account>();
    private static List<Account> RegisteredCustomers = new ArrayList<Account>();
    private static List<MedicineForCough> medicineForCough = new ArrayList<MedicineForCough>();
    private static List<MedicineForHeadache> medicineForHeadache = new ArrayList<MedicineForHeadache>();
    private static List<MedicineForBodyPain> medicineForBodyPain = new ArrayList<MedicineForBodyPain>();
    private static List<MedicineForAllergies> medicineForAllergies = new ArrayList<MedicineForAllergies>();

    Scanner user_input = new Scanner(System.in);

    public User() {

    }

    public static List<Account> getRegisteredPharmacists() {
        return RegisteredPharmacists;
    }

    public static void setRegisteredPharmacists(List<Account> RegisteredPharmacists) {
        User.RegisteredPharmacists = RegisteredPharmacists;
    }

    public static List<Account> getRegisteredCustomers() {
        return RegisteredCustomers;
    }

    public static void setRegisteredCustomers(List<Account> RegisteredCustomers) {
        User.RegisteredCustomers = RegisteredCustomers;
    }

    public static List<MedicineForCough> getMedicineForCough() {
        return medicineForCough;
    }

    public static void setMedicineForCough(List<MedicineForCough> medicineForCough) {
        User.medicineForCough = medicineForCough;
    }

    public static List<MedicineForHeadache> getMedicineForHeadache() {
        return medicineForHeadache;
    }

    public static void setMedicineForHeadache(List<MedicineForHeadache> medicineForHeadache) {
        User.medicineForHeadache = medicineForHeadache;
    }

    public static List<MedicineForBodyPain> getMedicineForBodyPain() {
        return medicineForBodyPain;
    }

    public static void setMedicineForBodyPain(List<MedicineForBodyPain> medicineForBodyPain) {
        User.medicineForBodyPain = medicineForBodyPain;
    }

    public static List<MedicineForAllergies> getMedicineForAllergies() {
        return medicineForAllergies;
    }

    public static void setMedicineForAllergies(List<MedicineForAllergies> medicineForAllergies) {
        User.medicineForAllergies = medicineForAllergies;
    }

    @Override
    public void AfterLoggedout(Account a) {
        System.out.println("\n1. Register\n2. Log in\n");
        String des = user_input.nextLine();
        switch (des) {
            case "1":
                User a1 = new User();
                Account newAcc = new Account();
                a1.Basic(newAcc);
                break;
            case "2":
                this.LoginAs(a);
                break;
            default:
                System.err.println("\nInvalid Input!");
                break;
        }
    }

    @Override
    public void LoginAs(Account a) {
        System.out.print("\n1. Customer\n2. Pharmacist\n\nLogin as: ");
        String log = user_input.nextLine();
        if (log.equals("1")) {
            this.LoginAsCustomer(a);
        } else if (log.equals("2")) {
            this.LoginAsPharmacist(a);
        }
    }

    @Override
    public void Login(Account a) {
        System.out.print("\n1. Customer\n2. Pharmacist\n\nLogin as: ");
        String log = user_input.nextLine();
        if (log.equals("1")) {
            this.LoginAsCustomer(a);
        } else if (log.equals("2")) {
            this.LoginAsPharmacist(a);
        }
    }

    @Override
    public void Basic(Account a) {
        System.err.println(ANSI_CYAN + "Notice to the users: \n\t\tJust type the number assigned to the transaction that you will do later in the program.\n\t\t" +ANSI_YELLOW+ "Example: 1.Purchase\n" + ANSI_RESET);
        System.out.print("\nAlready have an account? yes/no : ");
        String log = user_input.nextLine();
        switch (log) {
            case "yes":
                this.Login(a);
                break;
            case "no":
                this.Register(a);
                break;
            default:
                System.err.println("\nInvalid Input!");
                break;
        }
    }

    @Override
    public void Register(Account a) {
        System.out.println("\n--- REGISTER HERE ---");
        System.out.print("\n1. Customer\n2. Pharmacist\n");
        System.out.print("\nRegister as: ");
        String register = user_input.nextLine();
        switch (register) {
            case "1": {
                this.RegisterAsCustomer(a);
                break;
            }
            case "2": {
                this.RegisterAsPharmacist(a);
                break;
            }
            default:
                System.err.println("\nInvalid Input!");
                break;
        }
    }

    @Override
    public void LoginAsPharmacist(Account a) {
        Pharmacist pharmacist = new Pharmacist();
        pharmacist.Login(a);

    }

    @Override
    public void LoginAsCustomer(Account a) {
        if (a.getAge() < 60) {
            Adult adult = new Adult();
            adult.LoginAsAdult(a);
        } else if (a.getAge() > 60) {
            SeniorCitizen senior = new SeniorCitizen();
            senior.LoginAsSeniorCitizen(a);
        } else if (a.getAge() < 1) {
            System.err.println("\nInvalid Age!");
        }
    }

    @Override
    public void Logout(Account a) {
        while (true) {
            System.out.println("\nYou are now logged out.\n");
            System.out.print("Do you want to exit the program? yes/no: ");
            String exit = user_input.nextLine();
            if (exit.equals("no")) {
                this.AfterLoggedout(a);
            } else if (exit.equals("yes")) {
                System.out.println("\nExit");
                Runtime.getRuntime().exit(0);
            }
            break;
        }
    }

    @Override
    public void RegisterAsCustomer(Account a) {
        System.out.print("\nEnter first name: ");
        String fname = user_input.nextLine();
        a.setFname(fname);
        System.out.print("Enter last name: ");
        String lname = user_input.nextLine();
        a.setLname(lname);
        System.out.print("Enter username: ");
        String uname = user_input.nextLine();
        a.setUserName(uname);
        System.out.print("Enter password: ");
        String pass = user_input.nextLine();
        a.setPassWord(pass);
        System.out.print("Enter address: ");
        String address = user_input.nextLine();
        a.setAddress(address);
        System.out.print("Enter age: ");
        String age = user_input.nextLine();
        a.setAge(Integer.valueOf(age));
        this.addRegisteredCustomer(a);
        this.LoginAsCustomer(a);
    }

    @Override
    public void RegisterAsPharmacist(Account a) {
        System.out.print("\nEnter first name: ");
        String fname = user_input.nextLine();
        a.setFname(fname);
        System.out.print("Enter last name: ");
        String lname = user_input.nextLine();
        a.setLname(lname);
        System.out.print("Enter username: ");
        String uname = user_input.nextLine();
        a.setUserName(uname);
        System.out.print("Enter password: ");
        String pass = user_input.nextLine();
        a.setPassWord(pass);
        System.out.print("Enter Licensed No: ");
        String licensed = user_input.nextLine();
        a.setPharLicensedNo(Integer.valueOf(licensed));
        System.out.print("Enter address: ");
        String address = user_input.nextLine();
        a.setAddress(address);
        System.out.print("Enter age : ");
        String age = user_input.nextLine();
        a.setAge(Integer.valueOf(age));
        this.addRegisteredPharmacist(a);
        this.LoginAsPharmacist(a);
    }

    public void addRegisteredPharmacist(Account a) {
        System.out.println("\n" + a.getUserName() + " you are now registered.");
        RegisteredPharmacists.add(a);
    }

    public void addRegisteredCustomer(Account a) {
        System.out.println("\n" + a.getUserName() + " you are now registered.");
        RegisteredCustomers.add(a);
    }
}
