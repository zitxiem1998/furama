package service.impl;

import model.House;
import service.HouseService;

public class HouseServiceImpl implements HouseService {
    @Override
    public void displayHouse() {
        House house=new House();
        for(House hou: house.getHouses()) {
            System.out.println(hou.getName()+", mô tả về house: "+hou.getDescription());
        }
    }
}
