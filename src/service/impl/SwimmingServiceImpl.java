package service.impl;

import service.SwimmingService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class SwimmingServiceImpl implements SwimmingService {
    @Override
    public void displayOpeningHours() {
        System.out.println("Giờ mở cửa của hồ bơi là 8h.Mong quý khách thông cảm.");

    }

    @Override
    public void swim() {
        LocalDateTime localDate=LocalDateTime.now();
        if(localDate.getHour()<9) {
            System.out.println("Hồ bơi mở cửa lúc 9h. XIn bạn hãy chờ đến 9h.");
        } else {
            System.out.println("Hồ bơi đã mở cửa. Chúc các bạn chơi vui vẻ.");
        }

    }
}
