/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyapp;

/**
 *
 * @author 2ndyrGroupB
 */
public class PharmacyApp {

    public static void main(String[] args) {
        
        User user = new User();
        Account newAccount = new Account();
        Pharmacy rose = new Pharmacy("Rose");
        
        //Registered Customers instances
        Account acc1 = new Account("Rangie","Laurente","rLaurente","GwapoAko","Cebu",20);
        Account acc2 = new Account("James","Reid","jReid","GwapoSad","Manila",25);
        Account acc3 = new Account("Nadine","Lustre","nLustre","GwapaAko","Manila",25);
        
        //Registered Pharmacist instances
        Account p1 = new Account("Piolo","Pascual","papaPi","MasGwapo","Cebu",20);
        
        // Adding them to the list of Registered Customers
        user.addRegisteredCustomer(acc1);
        user.addRegisteredCustomer(acc2);
        user.addRegisteredCustomer(acc3);
        
        //Adding to Registered Pharmacists
        user.addRegisteredPharmacist(p1);
        
        // Stored medicines in the Pharamacy
        
        // Medicines for allergies
        MedicineForAllergies mfa1 = new MedicineForAllergies(0,"Azetic","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        MedicineForAllergies mfa2 = new MedicineForAllergies(0,"Alavert","Loratadine",20,"Capsul","March 11, 2020", 20);
        MedicineForAllergies mfa3 = new MedicineForAllergies(0,"Alrex","Etabonate",5,"Tablet","March 10, 2020", 20);
        MedicineForAllergies mfa4 = new MedicineForAllergies(0,"Haplas","Ointment",10,"Syrup","March 10, 2020", 20);
        MedicineForAllergies mfa5 = new MedicineForAllergies(0,"Bicks","Vapo Rub",8,"Capsule","March 10, 2020", 20);
        
        // Medicines for cough
        MedicineForCough mfc1 = new MedicineForCough(0,"Sulbotamol","Anti-Cough",45,"Syrup","March 10, 2020", 20);
        MedicineForCough mfc2 = new MedicineForCough(0,"Ambroxol","E+",5,"Tablet","March 10, 2020", 20);
        MedicineForCough mfc3 = new MedicineForCough(0,"Lagundi","Flemex",60,"Syrup","March 10, 2020", 20);
        MedicineForCough mfc4 = new MedicineForCough(0,"Tuseran","Forte",10,"Tablet","March 10, 2020", 20);
        MedicineForCough mfc5 = new MedicineForCough(0,"Carbociestine","Fresh",50,"Syrup","March 10, 2020", 20);
        
        // Medicines for headache
        MedicineForHeadache mfh1 = new MedicineForHeadache(0,"Biogesic","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        MedicineForHeadache mfh2 = new MedicineForHeadache(0,"Bioflu","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        MedicineForHeadache mfh3 = new MedicineForHeadache(0,"Alaxan","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        MedicineForHeadache mfh4 = new MedicineForHeadache(0,"Dolpenal","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        MedicineForHeadache mfh5 = new MedicineForHeadache(0,"Advil","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        
        // Medicines for body pain
        MedicineForBodyPain mfb1 = new MedicineForBodyPain(0,"Salonpas","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        MedicineForBodyPain mfb2 = new MedicineForBodyPain(0,"Omega+","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        MedicineForBodyPain mfb3 = new MedicineForBodyPain(0,"Alaxan Fr","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        MedicineForBodyPain mfb4 = new MedicineForBodyPain(0,"Eficascent","Anti-Katol",15,"Tablet","March 10, 2020", 20);
        MedicineForBodyPain mfb5 = new MedicineForBodyPain(0,"Vicks","Anti-Katol",15,"Tablet","March 10, 2020", 20);
       
        
        rose.addMedicineForAllergies(mfa1);
        rose.addMedicineForAllergies(mfa2);
        rose.addMedicineForAllergies(mfa3);
        rose.addMedicineForAllergies(mfa4);
        rose.addMedicineForAllergies(mfa5);
        
        rose.addMedicineForBodyPain(mfb1);
        rose.addMedicineForBodyPain(mfb2);
        rose.addMedicineForBodyPain(mfb3);
        rose.addMedicineForBodyPain(mfb4);
        rose.addMedicineForBodyPain(mfb5);
        
        rose.addMedicineForCough(mfc1);
        rose.addMedicineForCough(mfc2);
        rose.addMedicineForCough(mfc3);
        rose.addMedicineForCough(mfc4);
        rose.addMedicineForCough(mfc5);
        
        rose.addMedicineForHeadache(mfh1);
        rose.addMedicineForHeadache(mfh2);
        rose.addMedicineForHeadache(mfh3);
        rose.addMedicineForHeadache(mfh4);
        rose.addMedicineForHeadache(mfh5);
        
        
        user.Basic(newAccount);
    }
}
