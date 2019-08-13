package controller;

import model.Customer;
import service.CustomerService;
import service.SwimmingService;
import service.impl.CustomerServiceImpl;
import service.impl.SwimmingServiceImpl;

import java.util.Scanner;

public class ControllerDate1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControllerDate1 controllerDate1 = new ControllerDate1();
        CustomerService customerService = new CustomerServiceImpl();
        SwimmingService swimmingService = new SwimmingServiceImpl();
        Customer customer = new Customer(1, "Nguyen Van A", 20, "Quang Nam");

        System.out.println("Công việc mà bạn muốn thực hiện: ");
        System.out.println("1: Tính tiền khác hàng.");
        System.out.println("2: Hiển thị giờ mở cửa hồ bơi.");
        System.out.println("3: Đã đến giờ mở cửa hay chưa.");
        System.out.println("-----------------------------------------------------------------");
        int temp;
        do {
            System.out.println("Mời bạn nhập công việc: ");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    customerService.charge(customer);
                    break;
                }
                case 2: {
                    swimmingService.displayOpeningHours();
                    break;
                }
                case 3: {
                    swimmingService.swim();
                    break;
                }
                default:
                    System.exit(0);
            }
        } while (temp != 0);
    }
}
