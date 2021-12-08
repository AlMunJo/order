package com.joachim.order.domain.items;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public final class ItemGroup {
    private final List<ItemSnapshot> itemSnapshots;
    private final double unitPrice;
    private final int amount;
    private final LocalDate shippingDate;

    public ItemGroup(List<ItemSnapshot> itemSnapshots, double unitPrice, int amount) {
        this.itemSnapshots = itemSnapshots;
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.shippingDate = LocalDate.now();
    }

    public List<ItemSnapshot> getItemSnapshots() {
        return itemSnapshots;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }
}
