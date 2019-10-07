/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

/**
 *
 * @author laurentera_sd2022
 */
public interface CustomerOperation {

    public void viewAvailableMedicines(Account a);

    public boolean purchaseMedicines(Account a);

    public boolean purchaseMedicineForCough(int id);

    public boolean purchaseMedicineForHeadache(int id);

    public boolean purchaseMedicineForBodyPain(int id);

    public boolean purchaseMedicineForAllergies(int id);

    public void viewPurchasedMedicines(Account a);

    public void CustomerMainTransaction(Account a);

    public boolean availDiscount(Medicine m);

    public void LoginAsAdult(Account a);

    public void LoginAsSeniorCitizen(Account a);
}
