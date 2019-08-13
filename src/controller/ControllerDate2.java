package controller;

import service.HouseService;
import service.VillaService;
import service.impl.HouseServiceImpl;
import service.impl.VillaServiceImpl;

import java.util.Scanner;

public class ControllerDate2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        VillaService villaService=new VillaServiceImpl();
        HouseService houseService=new HouseServiceImpl();

        System.out.println("Công việc mà bạn muốn thực hiện: ");
        System.out.println("1: Hiển thị danh sách villa.");
        System.out.println("2: Hiển thị danh sách house.");
        System.out.println("-----------------------------------------------------------------");
        int temp;
        do {
            System.out.println("Mời bạn nhập công việc: ");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    villaService.displayVilla();
                    break;
                }
                case 2: {
                    houseService.displayHouse();
                    break;
                }
                default:
                    System.exit(0);
            }
        } while (temp != 0);
    }
}
