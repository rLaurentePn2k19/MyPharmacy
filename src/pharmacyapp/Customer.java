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
public abstract class Customer extends User implements CustomerOperation {
    
    private Account account;
    private int cash;
    private int check;
    private int credit;
    private int age;

    public Customer() {
    }
    
    
    public Customer(Account account, int cash, int age) {
        this.account = account;
        this.cash = cash;
        this.age = age;
    }
    
    public Customer(Account account, int cash, int check, int age) {
        this.account = account;
        this.cash = cash;
        this.check = check;
        this.age = age;
    }
    
    public Customer(Account account, int cash, int check, int credit ,int age) {
        this.account = account;
        this.cash = cash;
        this.check = check;
        this.credit = credit;
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" + "account=" + account + ", cash=" + cash + ", check=" + check + ", credit=" + credit + ", age=" + age + '}';
    }
    
    

    
    
 
    

  
}
