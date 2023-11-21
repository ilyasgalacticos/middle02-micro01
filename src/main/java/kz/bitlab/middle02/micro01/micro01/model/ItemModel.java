package kz.bitlab.middle02.micro01.micro01.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_tovary")
@Getter
@Setter
public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "item_name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "amount")
    private int amount;

}
