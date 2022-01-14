package com.joachim.order.domain.items;

import com.joachim.order.domain.users.Customer;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name="customer_id",foreignKey = @ForeignKey(name="order_customer_fk"))
    private Customer customer;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name="order_id",foreignKey = @ForeignKey(name="order_itemGroup_fk"))
    private List<ItemGroup> itemGroups;

    public Order(){

    }

    public Order(Customer customer, List<ItemGroup> itemGroups) {
        this.customer = customer;
        this.itemGroups = itemGroups;
    }

    public long getId() {
        return id;
    }

    public List<ItemGroup> getItemGroups() {
        return itemGroups;
    }

    public double getTotalPrice(){
        return itemGroups.stream().mapToDouble(e -> e.getUnitPrice()*e.getAmount()).sum();
    }

    public Customer getCustomer() {
        return customer;
    }
}
