/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Pharmacist extends User implements PharmacistOperation {

    private int id;
    private Account account;

    Scanner input = new Scanner(System.in);

    public Pharmacist() {
        super();
    }

    @Override
    public String toString() {
        return "Pharmacist{" + "id=" + id + ", account=" + account + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Pharmacist(int id, Account account) {
        this.id = id;
        this.account = account;
    }

    @Override
    public void inventoryMedicineForCough() {
        System.out.println("\n\t\t--- INVENTORY OF MEDICINES FOR COUGH ---");
        System.out.println("____________________________________________");
        System.out.printf("  %-12s  |  %-11s   |   %-6s   |   %-8s   ", ANSI_GREEN + "Brand Name", "Generic Name", "Type", "Quantity\n" + ANSI_RESET);
        System.out.println("____________________________________________");
        for (int i = 0; i < User.getMedicineForCough().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  \n", User.getMedicineForCough().get(i).getBrandName(), User.getMedicineForCough().get(i).getGenericName(), User.getMedicineForCough().get(i).getType(), User.getMedicineForCough().get(i).getQuantity());
            System.out.println("_________________________________________");
        }
    }

    @Override
    public void inventoryMedicineForHeadache() {
        System.out.println("\n\t\t--- INVENTORY OF MEDICINES FOR HEADACHE ---");
        System.out.println("_____________________________________________");
        System.out.printf("  %-12s  |  %-11s   |   %-6s   |   %-8s   ", ANSI_GREEN + "Brand Name", "Generic Name", "Type", "Quantity\n" + ANSI_RESET);
        System.out.println("_____________________________________________");
        for (int i = 0; i < User.getMedicineForHeadache().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  \n", User.getMedicineForHeadache().get(i).getBrandName(), User.getMedicineForHeadache().get(i).getGenericName(), User.getMedicineForHeadache().get(i).getType(), User.getMedicineForHeadache().get(i).getQuantity());
            System.out.println("____________________________________________");
        }
    }

    @Override
    public void inventoryMedicineForBodyPain() {
        System.out.println("\n\t\t--- INVENTORY OF MEDICINES FOR BODY PAIN ---");
        System.out.println("____________________________________________");
        System.out.printf("  %-12s  |  %-11s   |   %-6s   |   %-8s   ", ANSI_GREEN + "Brand Name", "Generic Name", "Type", "Quantity\n" + ANSI_RESET);
        System.out.println("_____________________________________________");
        for (int i = 0; i < User.getMedicineForBodyPain().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  \n", User.getMedicineForBodyPain().get(i).getBrandName(), User.getMedicineForBodyPain().get(i).getGenericName(), User.getMedicineForBodyPain().get(i).getType(), User.getMedicineForBodyPain().get(i).getQuantity());
            System.out.println("____________________________________________");
        }
    }

    @Override
    public void inventoryMedicineForAllergies() {
        System.out.println("\n\t\t--- INVENTORY OF MEDICINES FOR ALLERGIES ---");
        System.out.println("____________________________________________");
        System.out.printf("  %-12s  |  %-11s   |   %-6s   |   %-8s   ", ANSI_GREEN + "Brand Name", "Generic Name", "Type", "Quantity\n" + ANSI_RESET);
        System.out.println("_____________________________________________");
        for (int i = 0; i < User.getMedicineForAllergies().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  \n", User.getMedicineForAllergies().get(i).getBrandName(), User.getMedicineForAllergies().get(i).getGenericName(), User.getMedicineForAllergies().get(i).getType(), User.getMedicineForAllergies().get(i).getQuantity());
            System.out.println("____________________________________________");
        }
    }

    @Override
    public boolean addMedicineForCough(MedicineForCough m) {
        m.setId(User.getMedicineForCough().size() + 1);
        User.getMedicineForCough().add(m);
        System.out.println(m.getBrandName() + " is added");
        return true;
    }

    @Override
    public boolean addMedicineForHeadache(MedicineForHeadache m) {
        m.setId(User.getMedicineForHeadache().size() + 1);
        User.getMedicineForHeadache().add(m);
        System.out.println(m.getBrandName() + " is added");
        return true;
    }

    @Override
    public boolean addMedicineForBodyPain(MedicineForBodyPain m) {
        m.setId(User.getMedicineForBodyPain().size() + 1);
        User.getMedicineForBodyPain().add(m);
        System.out.println(m.getBrandName() + " is added");
        return true;
    }

    @Override
    public boolean addMedicineForAllergies(MedicineForAllergies m) {
        m.setId(User.getMedicineForAllergies().size() + 1);
        User.getMedicineForAllergies().add(m);
        System.out.println(m.getBrandName() + " is added");
        return true;
    }

    @Override
    public boolean removeMedicineForCough(MedicineForCough m) {
        System.out.print("How many " + m.getBrandName() + " do you want to remove?: ");
        int rem = input.nextInt();
        if(m.getQuantity() == rem){
            User.getMedicineForCough().remove(m);
            System.out.println("\n"+m.getBrandName()+ " has been removed.");
        }else if(m.getQuantity() > rem){
            m.setQuantity(m.getQuantity() - rem);
            System.out.println("\n"+m.getBrandName()+" is deducted by "+ rem);
        }
        return true;
    }

    @Override
    public boolean removeMedicineForHeadache(MedicineForHeadache m) {
        System.out.print("How many " + m.getBrandName() + " do you want to remove?: ");
        int rem = input.nextInt();
        if(m.getQuantity() == rem){
            User.getMedicineForHeadache().remove(m);
            System.out.println("\n"+m.getBrandName()+ " has been removed.");
        }else if(m.getQuantity() > rem){
            m.setQuantity(m.getQuantity() - rem);
            System.out.println("\n"+m.getBrandName()+" is deducted by "+ rem);
        }
        return true;
    }

    @Override
    public boolean removeMedicineForBodyPain(MedicineForBodyPain m) {
        System.out.print("How many " + m.getBrandName() + " do you want to remove?: ");
        int rem = input.nextInt();
        if(m.getQuantity() == rem){
            User.getMedicineForBodyPain().remove(m);
            System.out.println("\n"+m.getBrandName()+ " has been removed.");
        }else if(m.getQuantity() > rem){
            m.setQuantity(m.getQuantity() - rem);
            System.out.println("\n"+m.getBrandName()+" is deducted by "+ rem);
        }
        return true;
    }

    @Override
    public boolean removeMedicineForAllergies(MedicineForAllergies m) {
        System.out.print("How many " + m.getBrandName() + " do you want to remove?: ");
        int rem = input.nextInt();
        if(m.getQuantity() == rem){
            User.getMedicineForAllergies().remove(m);
            System.out.println("\n"+m.getBrandName()+ " has been removed.");
        }else if(m.getQuantity() > rem){
            m.setQuantity(m.getQuantity() - rem);
            System.out.println("\n"+m.getBrandName()+" is deducted by "+ rem);
        }
        return true;
    }

    @Override
    public void displayAvailableMedicinesForCough() {
        System.out.println("\n\t\t\t\t\t\t--- MEDICINES FOR COUGH ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-12s  |  %-11s   |   %-6s   |   %-8s   |  %-9s   |  %10s |  %12s", ANSI_YELLOW + "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n" + ANSI_RESET);
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < User.getMedicineForCough().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  | %-12s | %-15s | %10d\n", User.getMedicineForCough().get(i).getId(), User.getMedicineForCough().get(i).getBrandName(), User.getMedicineForCough().get(i).getGenericName(), User.getMedicineForCough().get(i).getPrice(), User.getMedicineForCough().get(i).getType(), User.getMedicineForCough().get(i).getExpirationDate(), User.getMedicineForCough().get(i).getQuantity());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    @Override
    public void displayAvailableMedicinesForHeadache() {
        System.out.println("\n\t\t\t\t\t\t--- MEDICINES FOR HEADACHE ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-12s  |  %-11s   |   %-6s   |   %-8s   |  %-9s   |  %10s |  %12s", ANSI_YELLOW + "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n" + ANSI_RESET);
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < User.getMedicineForHeadache().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  | %-12s | %-15s | %10d\n", User.getMedicineForHeadache().get(i).getId(), User.getMedicineForHeadache().get(i).getBrandName(), User.getMedicineForHeadache().get(i).getGenericName(), User.getMedicineForHeadache().get(i).getPrice(), User.getMedicineForHeadache().get(i).getType(), User.getMedicineForHeadache().get(i).getExpirationDate(), User.getMedicineForHeadache().get(i).getQuantity());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    @Override
    public void displayAvailableMedicinesForBodyPain() {
        System.out.println("\n\t\t\t\t\t\t--- MEDICINES FOR BODY PAIN ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf(" %-12s  |  %-11s   |   %-6s  |   %-8s  |  %-9s   |  %10s |  %12s", ANSI_YELLOW + "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n" + ANSI_RESET);
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < User.getMedicineForBodyPain().size(); i++) {
            System.out.printf(" %-12s   |  %-14s  |  %-14s  |  %-8d  |  %-12s  |  %-15s  | %10d\n", User.getMedicineForBodyPain().get(i).getId(), User.getMedicineForBodyPain().get(i).getBrandName(), User.getMedicineForBodyPain().get(i).getGenericName(), User.getMedicineForBodyPain().get(i).getPrice(), User.getMedicineForBodyPain().get(i).getType(), User.getMedicineForBodyPain().get(i).getExpirationDate(), User.getMedicineForBodyPain().get(i).getQuantity());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    @Override
    public void displayAvailableMedicinesForAllergies() {
        System.out.println("\n\t\t\t\t\t\t--- MEDICINES FOR ALLERGIES ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-12s  | %-11s   |   %-6s   |   %-8s   |  %-9s   |  %10s |  %12s", ANSI_YELLOW + "Medicine ID", "Brand Name", "Generic Name", "Price", "Type", "Expiration Date", "Quantity\n" + ANSI_RESET);
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < User.getMedicineForAllergies().size(); i++) {
            System.out.printf(" %-12s  | %-14s | %-14s | %-8d  | %-12s | %-15s | %10d\n", User.getMedicineForAllergies().get(i).getId(), User.getMedicineForAllergies().get(i).getBrandName(), User.getMedicineForAllergies().get(i).getGenericName(), User.getMedicineForAllergies().get(i).getPrice(), User.getMedicineForAllergies().get(i).getType(), User.getMedicineForAllergies().get(i).getExpirationDate(), User.getMedicineForAllergies().get(i).getQuantity());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    @Override
    public void PharmacistMainTransaction(Account a) {
        Medicine m = new Medicine();
        while (true) {
            System.out.println("\n--- CHOOSE OPERATION ---");
            System.out.println("\n1. Add Medicine\n2. Remove Medicine\n3. Display Medicines\n4. Inventory\n5. View Customers\n6. Logout");
            System.out.print("\nSelect Operation: ");
            String operation = input.nextLine();
            switch (operation) {
                case "1": {
                    System.out.println("\nIn what list of medicine do you want to add medicine?");
                    System.out.println("\n1. Medicine For Cough\n2. Medicine For Headache\n3. Medicine For Body Pain\n4. Medicine For Allergies\n5. Back");
                    String select = input.nextLine();
                    switch (select) {
                        case "1": {
                            MedicineForCough mfc = new MedicineForCough(0);
                            System.out.print("Brand Name: ");
                            String brandname = input.nextLine();
                            mfc.setBrandName(brandname);
                            System.out.print("Generic Name: ");
                            String genericname = input.nextLine();
                            mfc.setGenericName(genericname);
                            System.out.print("Type(Capsule/Table/Syrup): ");
                            String type = input.nextLine();
                            mfc.setType(type);
                            System.out.print("Price: ");
                            String price = input.nextLine();
                            mfc.setPrice(Integer.valueOf(price));
                            System.out.print("Expiration Date: ");
                            String exp = input.nextLine();
                            mfc.setExpirationDate(exp);
                            System.out.print("Quantity: ");
                            int qty = input.nextInt();
                            mfc.setQuantity(qty);
                            this.addMedicineForCough(mfc);
                            break;
                        }
                        case "2": {
                            MedicineForHeadache mfh = new MedicineForHeadache(0);
                            System.out.print("Brand Name: ");
                            String brandname = input.nextLine();
                            mfh.setBrandName(brandname);
                            System.out.print("Generic Name: ");
                            String genericname = input.nextLine();
                            mfh.setGenericName(genericname);
                            System.out.print("Type(Capsule/Table/Syrup): ");
                            String type = input.nextLine();
                            mfh.setType(type);
                            System.out.print("Price: ");
                            String price = input.nextLine();
                            mfh.setPrice(Integer.valueOf(price));
                            System.out.print("Expiration Date: ");
                            String exp = input.nextLine();
                            mfh.setExpirationDate(exp);
                            System.out.print("Quantity: ");
                            int qty = input.nextInt();
                            mfh.setQuantity(qty);
                            this.addMedicineForHeadache(mfh);
                            break;
                        }
                        case "3": {
                            MedicineForBodyPain mfb = new MedicineForBodyPain(0);
                            System.out.print("Brand Name: ");
                            String brandname = input.nextLine();
                            mfb.setBrandName(brandname);
                            System.out.print("Generic Name: ");
                            String genericname = input.nextLine();
                            mfb.setGenericName(genericname);
                            System.out.print("Type(Capsule/Table/Syrup): ");
                            String type = input.nextLine();
                            mfb.setType(type);
                            System.out.print("Price: ");
                            String price = input.nextLine();
                            mfb.setPrice(Integer.valueOf(price));
                            System.out.print("Expiration Date: ");
                            String exp = input.nextLine();
                            mfb.setExpirationDate(exp);
                            System.out.print("Quantity: ");
                            int qty = input.nextInt();
                            mfb.setQuantity(qty);
                            this.addMedicineForBodyPain(mfb);
                            break;
                        }
                        case "4": {
                            MedicineForAllergies mfa = new MedicineForAllergies(0);
                            System.out.print("Brand Name: ");
                            String brandname = input.nextLine();
                            mfa.setBrandName(brandname);
                            System.out.print("Generic Name: ");
                            String genericname = input.nextLine();
                            mfa.setGenericName(genericname);
                            System.out.print("Type(Capsule/Table/Syrup): ");
                            String type = input.nextLine();
                            mfa.setType(type);
                            System.out.print("Price: ");
                            String price = input.nextLine();
                            mfa.setPrice(Integer.valueOf(price));
                            System.out.print("Expiration Date: ");
                            String exp = input.nextLine();
                            mfa.setExpirationDate(exp);
                            System.out.print("Quantity: ");
                            int qty = input.nextInt();
                            mfa.setQuantity(qty);
                            this.addMedicineForAllergies(mfa);
                            break;
                        }
                        case "5": {
                            this.PharmacistMainTransaction(a);
                        }
                        default:
                            System.err.println("\nInvalid Input!");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("\nIn what list of medicine do you want to remove medicine?");
                    System.out.println("\n1. Medicine For Cough\n2. Medicine For Headache\n3. Medicine For Body Pain\n4. Medicine For Allergies\n5. Back");
                    String select = input.nextLine();
                    switch (select) {
                        case "1": {
                            this.displayAvailableMedicinesForCough();
                            System.out.print("\nEnter the id of the medicine you want to remove: ");
                            int id = input.nextInt();
                            for (MedicineForCough mfh : User.getMedicineForCough()) {
                                if (id == mfh.getId()) {
                                    this.removeMedicineForCough(mfh);
                                }
                            }
                            break;
                        }
                        case "2": {
                            this.displayAvailableMedicinesForHeadache();
                            System.out.println("\nEnter the id of the medicine you want to remove.");
                            int id = input.nextInt();
                            for (MedicineForHeadache mfh : User.getMedicineForHeadache()) {
                                if (id == mfh.getId()) {
                                    this.removeMedicineForHeadache(mfh);
                                }
                            }
                            break;
                        }
                        case "3": {
                            this.displayAvailableMedicinesForBodyPain();
                            System.out.println("\nEnter the id of the medicine you want to remove.");
                            int id = input.nextInt();
                            for (MedicineForBodyPain mfb : User.getMedicineForBodyPain()) {
                                if (id == mfb.getId()) {
                                    this.removeMedicineForBodyPain(mfb);
                                }
                            }
                            break;
                        }
                        case "4": {
                            this.displayAvailableMedicinesForAllergies();
                            System.out.println("\nEnter the id of the medicine you want to remove.");
                            int id = input.nextInt();
                            for (MedicineForAllergies mfa : User.getMedicineForAllergies()) {
                                if (id == mfa.getId()) {
                                    this.removeMedicineForAllergies(mfa);
                                }
                            }
                            break;
                        }
                        case "5":{
                            this.PharmacistMainTransaction(a);
                        }
                        default:
                            System.err.println("\nInvalid Input!");
                            break;
                    }
                    break;
                }
                case "3":
                    System.out.println("\nWhat list of medicine you want to display?");
                    System.out.println("\n1. Medicine For Cough\n2. Medicine For Headache\n3. Medicine For Body Pain\n4. Medicine For Allergies\n");
                    String dis = input.nextLine();
                    switch (dis) {
                        case "1":
                            this.displayAvailableMedicinesForCough();
                            break;
                        case "2":
                            this.displayAvailableMedicinesForHeadache();
                            break;
                        case "3":
                            this.displayAvailableMedicinesForBodyPain();
                            break;
                        case "4":
                            this.displayAvailableMedicinesForAllergies();
                            break;
                        default:
                            System.err.println("\nInvalid Input!");
                            break;
                    }
                    break;
                case "4":
                    System.out.println("\nWhat list of medicine you want to display the inventory?");
                    System.out.println("\n1. Medicine For Cough\n2. Medicine For Headache\n3. Medicine For Body Pain\n4. Medicine For Allergies\n");
                    String inv = input.nextLine();
                    switch (inv) {
                        case "1":
                            this.inventoryMedicineForCough();
                            break;
                        case "2":
                            this.inventoryMedicineForHeadache();
                            break;
                        case "3":
                            this.inventoryMedicineForBodyPain();
                            break;
                        case "4":
                            this.inventoryMedicineForAllergies();
                            break;
                        default:
                            System.err.println("\nInvalid Input!");
                            break;
                    }
                    break;

                case "5":
                    this.viewCustomers();
                    break;
                case "6":
                    System.out.print("\nAre you sure to Logout? yes/no : ");
                    String logout = input.nextLine();
                    if (logout.equals("yes")) {
                        this.Logout(a);
                    } else if (logout.equals("no")) {

                    }
                    break;
                default:
                    System.err.println("\nInvalid Input!");
                    break;
            }
        }
    }

    @Override
    public void Login(Account a) {
        System.out.println("\n--- LOGIN ---\nYou have 3 trials to Login");
        int trial = 0;
        while (trial != 3) {
            System.out.print("\nEnter Username: ");
            String username = input.nextLine();
            System.out.print("Enter Password: ");
            String password = input.nextLine();
            for (Account registeredPharmacist : User.getRegisteredPharmacists()) {
                if (registeredPharmacist.getUserName().equals(username) && registeredPharmacist.getPassWord().equals(password)) {
                    System.out.println("\n"+a.getFname() + " " + a.getLname() + " You are now logged in.\n");
                    System.out.println("You can now do the transaction.");
                    this.PharmacistMainTransaction(a);
                } else {
                    System.err.println("Incorrect filled inputs.");
                    trial++;
                }
            }
        }
    }

    @Override
    public void Logout(Account a) {
        super.Logout(a);

    }

    @Override
    public void Register(Account a) {

    }

    @Override
    public void viewCustomers() {
        System.out.println("\n\t\t--- CUSTOMERS ---");
        System.out.println("_____________________________________________________");
        System.out.printf(" %-10s  |  %-8s   |   %-6s  |   %-4s  ", "First name", "Last name", "Address", "Age\n");
        System.out.println("______________________________________________________");
        for (int i = 0; i < User.getRegisteredCustomers().size(); i++) {
            System.out.printf(" %-10s |  %-8s  | %-6s  |  %-4d\n", User.getRegisteredCustomers().get(i).getFname(), User.getRegisteredCustomers().get(i).getLname(), User.getRegisteredCustomers().get(i).getAddress(), getRegisteredCustomers().get(i).getAge());
            System.out.println("_____________________________________________________");
        }
    }

}
