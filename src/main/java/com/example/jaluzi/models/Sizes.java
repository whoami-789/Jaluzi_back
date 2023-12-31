package com.example.jaluzi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sizes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sizes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double width;
    private double height;
    private double price;
    private int quantity;
    private double total;
    private String note = "";
    private double square = width * height;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;

    @PrePersist
    @PreUpdate
    private void calculateTotal() {
        if (this.square <= 1.0) {
             this.total = this.price * this.quantity;
        } else {
            this.total = ((this.height * this.width) * this.quantity) * this.price;
        }
    }
}
