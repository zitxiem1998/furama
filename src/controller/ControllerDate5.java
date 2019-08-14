package controller;

import service.PaymentService;
import service.impl.MasterCardServiceImpl;
import service.impl.VisaCardServiceImpl;

import java.util.Scanner;

public class ControllerDate5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentService visaCard=new VisaCardServiceImpl();
        PaymentService maserCard=new MasterCardServiceImpl();
        System.out.println("Phương thức thanh toán: ");
        System.out.println("1: Visa Card.");
        System.out.println("2: Master Card.");
        System.out.println("-----------------------------------------------------------------");
        int temp;
        do {
            System.out.println("Mời bạn nhập phương thức thanh toán: ");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    visaCard.pay();
                    break;
                }
                case 2: {
                    maserCard.pay();
                    break;
                }
                default:
                    System.exit(0);
            }
        } while (temp != 0);
    }
}
