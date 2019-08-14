package service;

import java.util.ArrayList;
import java.util.List;

public interface LibraryService<E> {
    void add(E e);

    void remove(int index);

    void display();

}
