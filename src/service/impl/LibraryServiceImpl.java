package service.impl;

import service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    List<Object> list = new ArrayList<>();

    @Override
    public void add(Object o) {
        list.add(o);
        System.out.println("Bạn đã thêm thành công.");
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Bạn nhập không đúng vị trí.");
        } else {
            list.remove(index);
            System.out.println("Bạn đã xóa thành công.");
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
