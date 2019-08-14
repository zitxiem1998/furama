package service.impl;

import service.PaymentService;

public class VisaCardServiceImpl implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Bạn đã chọn phương thức thanh toán là Visa Card");
    }
}
