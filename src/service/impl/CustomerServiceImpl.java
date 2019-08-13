package service.impl;

import model.Customer;
import model.Villa;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void charge(Customer customer) {
        System.out.println("Khách hàng " + customer.getName() + ", tuổi: " + customer.getAge() + " đã thuê 1 cái villa trong 4 ngày. Tổng giá tiền phải trả là:" + Villa.getPrice() * 4 +" USD");
    }
}
