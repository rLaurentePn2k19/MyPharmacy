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
public class SeniorCitizen extends Customer {

    Scanner input = new Scanner(System.in);

    public SeniorCitizen() {
    }

    public SeniorCitizen(Account account, int cash, int age) {
        super(account, cash, age);
    }

    public SeniorCitizen(Account account, int cash, int check, int age) {
        super(account, cash, check, age);
    }

    public SeniorCitizen(Account account, int cash, int check, int credit, int age) {
        super(account, cash, check, credit, age);
    }

    @Override
    public void viewAvailableMedicines(Account a) {
        Pharmacist p = new Pharmacist();
        System.out.println("\n1. Medicines for cough\n2. Medicines for headache\n3. Medicines for body pain\n4. Medicines for allergies\n5. Back");
        System.out.print("\nWhat specific list medicines you want to view?: ");
        String choose = input.nextLine();
        switch (choose) {
            case "1":
                p.displayAvailableMedicinesForCough();
                break;
            case "2":
                p.displayAvailableMedicinesForHeadache();
                break;
            case "3":
                p.displayAvailableMedicinesForBodyPain();
                break;
            case "4":
                p.displayAvailableMedicinesForAllergies();
                break;
            case "5":
                this.CustomerMainTransaction(a);
                break;
            default:
                System.out.println("\nInvalid Input!");
                break;
        }
    }

    @Override
    public boolean purchaseMedicines(Account a) {

        System.out.println("\nSelect a specific list of medicines you want to buy of. ");
        System.out.println("\n1. Medicines For Cough\n2. Medicines For Headache\n3. Medicines For Body Pain\n4. Medicines For Allergies\n5. Back");
        System.out.print("\nWhat specific list medicines the medicine you want to buy?: ");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                this.purchaseMedicineForCough(0);
                break;
            case "2":
                this.purchaseMedicineForHeadache(0);
                break;
            case "3":
                this.purchaseMedicineForBodyPain(0);
                break;
            case "4":
                this.purchaseMedicineForAllergies(0);
                break;
            case "5":
                this.CustomerMainTransaction(a);
                break;
            default:
                System.out.println("\nInvalid Input!");
                break;
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForHeadache(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForHeadache();
        System.out.print("\nSelect the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForHeadache med : Pharmacist.getMedicineForHeadache()) {
            if (med.getId() == id) {
                System.out.print("\nHow many " + med.getBrandName() + " do you want to buy? : ");
                int buy = input.nextInt();
                if (med.getQuantity() == buy) {
                    User.getMedicineForHeadache().remove(med);
                } else if (med.getQuantity() > buy) {
                    med.setQuantity(med.getQuantity() - buy);
                }
            } else if (id != med.getId()) {
                System.out.println("\nMedicine does not exist.");
                this.purchaseMedicineForCough(0);
            }
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForBodyPain(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForBodyPain();
        System.out.print("\nSelect the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForBodyPain med : Pharmacist.getMedicineForBodyPain()) {
            if (med.getId() == id) {
                System.out.print("\nHow many " + med.getBrandName() + " do you want to buy? : ");
                int buy = input.nextInt();
                if (med.getQuantity() == buy) {
                    User.getMedicineForBodyPain().remove(med);
                } else if (med.getQuantity() > buy) {
                    med.setQuantity(med.getQuantity() - buy);
                }
            } else if (id != med.getId()) {
                System.out.println("\nMedicine does not exist.");
                this.purchaseMedicineForCough(0);
            }
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForAllergies(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForAllergies();
        System.out.print("\nSelect the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForAllergies med : Pharmacist.getMedicineForAllergies()) {
            if (med.getId() == id) {
                System.out.print("\nHow many " + med.getBrandName() + " do you want to buy? : ");
                int buy = input.nextInt();
                if (med.getQuantity() == buy) {
                    User.getMedicineForAllergies().remove(med);
                } else if (med.getQuantity() > buy) {
                    med.setQuantity(med.getQuantity() - buy);
                }
            } else if (id != med.getId()) {
                System.out.println("\nMedicine does not exist.");
                this.purchaseMedicineForCough(0);
            }
        }
        return true;
    }

    @Override
    public boolean purchaseMedicineForCough(int id) {
        Pharmacist p = new Pharmacist();
        p.displayAvailableMedicinesForCough();
        System.out.print("\nSelect the ID of the medicine you want to buy: ");
        id = input.nextInt();
        for (MedicineForCough med : Pharmacist.getMedicineForCough()) {
            if (med.getId() == id) {
                System.out.print("\nHow many " + med.getBrandName() + " do you want to buy? : ");
                int buy = input.nextInt();
                if (med.getQuantity() == buy) {
                    User.getMedicineForCough().remove(med);
                } else if (med.getQuantity() > buy) {
                    med.setQuantity(med.getQuantity() - buy);
                }
            } else if (id != med.getId()) {
                System.out.println("\nMedicine does not exist.");
                this.purchaseMedicineForCough(0);
            }
        }
        return true;
    }

    @Override
    public void viewPurchasedMedicines(Account a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CustomerMainTransaction(Account a) {
        while (true) {
            System.out.println("\n--- CHOOSE OPERATION ---");
            System.out.println("\n1. View Available Medicines\n2. Purchase Medicines\n3. View Purchased Medicines\n4. Logout");
            System.out.print("\nSelect Transaction: ");
            String selection = input.nextLine();
            switch (selection) {
                case "1":
                    this.viewAvailableMedicines(a);
                    break;
                case "2":
                    this.purchaseMedicines(a);
                    break;
                case "3":
                    this.viewPurchasedMedicines(a);
                    break;
                case "4":
                    System.out.print("\nAre you sure to Logout? yes/no : ");
                    String logout = input.nextLine();
                    if (logout.equals("yes")) {
                        this.Logout(a);
                    } else if (logout.equals("no")) {
                        this.CustomerMainTransaction(a);
                    }
                    break;
                default:
                    System.out.println("\nInvalid Input!");
                    break;
            }
        }
    }

    @Override
    public boolean availDiscount(Medicine m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void LoginAsAdult(Account a) {
        
    }

    @Override
    public void LoginAsSeniorCitizen(Account a) {
        System.out.println("\n--- LOGIN ---\nYou have 3 trials to Login");
        int trial = 0;
        while (trial != 3) {
            System.out.print("\nEnter Username: ");
            String username = input.nextLine();
            System.out.print("Enter Password: ");
            String password = input.nextLine();
            for (Account registeredCustomer : Customer.getRegisteredCustomers()) {
                if (registeredCustomer.getUserName().equals(username) && registeredCustomer.getPassWord().equals(password)) {
                    System.out.println("\n--- WELCOME to ROSE PHARMACY ---\n\n" + a.getFname() + " " + a.getLname() + " \nYou are now logged in.\n");
                    System.out.println("\nYou can now purchase medicines and avail our 20% discounts.");
                    this.CustomerMainTransaction(a);
                } else {
                    System.out.println("\nIncorrect filled inputs.");
                    trial++;
                }
            }
        }
    }

}
