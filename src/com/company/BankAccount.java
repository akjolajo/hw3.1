package com.company;

public class BankAccount {
    private double amount;
    public double getAmount(){
        return  amount;
    }
    public void deposit(double sum){
    amount = getAmount() +  sum;
    }

    public void withDraw(int sum) throws LImitException{
    if(sum > amount){
       throw new LImitException("не достаточная средства  ",amount);
    }else {
        amount -= sum;
        System.out.println("снятие денги  "+ sum+ "  ваш счеть  " + getAmount());
    }
    }
}
