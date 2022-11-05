package com.company;

public class BankApplication {

        double balance;
        //bank account with zero balance
        public BankApplication() {
            balance = 0;
        }
        public void deposit(double initialbalance) {
            balance +=initialbalance;
        }
        public void deposit(){

        }
        public void withdrawl(double amount) throws IllegalAccessError {
            if (amount < 0) {
                throw new IllegalAccessError("Amount is under Zero");
            }
            balance = balance - amount;
        }
        public double getBalance() {
            return balance;
        }
    }

    class ThrowableException{
    public static void main(String[] args){
        BankApplication checking=new BankApplication();
        checking.deposit(2000);
        checking.withdrawl(1000);
        System.out.println(checking.getBalance());
    }
    }