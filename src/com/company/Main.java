package com.company;

public class Main {

    public static void main(String[] args) {
        //ctrl + K = commit
        //ctrl + Shift  + K = push
	// write your code here
        System.out.println("salam");
    BankAccount forakjolaccount = new BankAccount();
    forakjolaccount.deposit(20000);
    System.out.println("пополнение: ваш баланс " + forakjolaccount.getAmount());
    while (true) {
            try{
                forakjolaccount.withDraw(6000);
            }catch (LImitException e){
                try {
                    forakjolaccount.withDraw((int) forakjolaccount.getAmount());
                }catch (LImitException i){
                    i.printStackTrace();
                }
                break;
            }
        }
    }

}
