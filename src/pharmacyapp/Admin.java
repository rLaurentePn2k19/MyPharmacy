/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2ndyrGroupB
 */
public class Admin extends User{
    
    private List<Account> registeredCustomers = new ArrayList<Account>();
    private List<Account> registeredPharmacists = new ArrayList<Account>();

    public Admin() {
    }

//    public List<Account> getRegisteredCustomers() {
//        return registeredCustomers;
//    }
//
//    public void setRegisteredCustomers(List<Account> registeredCustomers) {
//        this.registeredCustomers = registeredCustomers;
//    }
//
//    public List<Account> getRegisteredPharmacists() {
//        return registeredPharmacists;
//    }
//
//    public void setRegisteredPharmacists(List<Account> registeredPharmacists) {
//        this.registeredPharmacists = registeredPharmacists;
//    }
    
        
    public void displayAccountsOfCustomers() {
        System.out.println("\n\t\t\t\t\t\t--- REGISTERED CUSTOMERS ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-10s  | %-10s   |   %-10s   |   %-10s   |  %-10s   |  %10s ", "First name", "Last name", "Username", "Password", "Address", "Age\n");
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < this.getRegisteredCustomers().size(); i++) {
            System.out.printf(" %-10s  |  %-10s  |  %-10s  |  %-10s   |  %-10s  | %10d\n", this.getRegisteredCustomers().get(i).getFname(),this.getRegisteredCustomers().get(i).getLname(), this.getRegisteredCustomers().get(i).getUserName(), this.getRegisteredCustomers().get(i).getPassWord(), this.getRegisteredCustomers().get(i).getAddress(), this.getRegisteredCustomers().get(i).getAge());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    
        public void displayAccountsOfPharmacist() {
        System.out.println("\n\t\t\t\t\t\t--- REGISTERED Pharmacist ---");
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.printf("  %-10s  | %-10s   |   %-10s   |   %-10s   |  %-10s   |  %-10s   |  %10s ", "First name", "Last name", "Username", "Password", "Licensed No", "Address", "Age\n");
        System.out.println("____________________________________________________________________________________________________________________");
        for (int i = 0; i < this.getRegisteredPharmacists().size(); i++) {
            System.out.printf(" %-10s  |  %-10s  |  %-10s  |  %-10s   |  %-10d   |  %-10s  | %10d\n", this.getRegisteredPharmacists().get(i).getFname(), this.getRegisteredPharmacists().get(i).getLname(), this.getRegisteredPharmacists().get(i).getUserName(), this.getRegisteredPharmacists().get(i).getPassWord(), this.getRegisteredPharmacists().get(i).getPharLicensedNo(), this.getRegisteredPharmacists().get(i).getAddress(), this.getRegisteredPharmacists().get(i).getAge());
            System.out.println("____________________________________________________________________________________________________________________");
        }
    }

    
}
