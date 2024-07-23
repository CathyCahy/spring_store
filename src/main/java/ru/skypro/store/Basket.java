package ru.skypro.store;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private final Set<Long> items = new HashSet<>();

    public void add(Set<Long> items) {
        this.items.addAll(items);
    }

    public Set<Long> get() {
        return items;
    }
}
