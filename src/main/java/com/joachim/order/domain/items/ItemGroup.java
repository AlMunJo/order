package com.joachim.order.domain.items;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public final class ItemGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double unitPrice;
    private int amount;
    private LocalDate shippingDate;

    @OneToOne
    @JoinColumn(foreignKey=@ForeignKey(name="itemGroup_item_fk"))
    private Item item;

    public ItemGroup() {
    }

    public ItemGroup(Item item, double unitPrice, int amount) {
        this.item = item;
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.shippingDate = LocalDate.now();
    }

    public Item getItem() {
        return item;
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

    private void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }
}
