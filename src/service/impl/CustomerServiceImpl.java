package service.impl;

import model.Customer;
import model.Villa;
import service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void charge(Customer customer) {
        System.out.println("Khách hàng " + customer.getName() + ", tuổi: " + customer.getAge() + " đã thuê 1 cái villa trong 4 ngày. Tổng giá tiền phải trả là:" + Villa.getPrice() * 4 +" USD");
    }

    @Override
    public void displayCustomer(List list) {
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
