package ru.skypro.store;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }
    public void add(Set<Long> items) {
        basket.add(items);
    }

    public Set<Long> get() {
        return basket.get();
    }
}
