package kz.bitlab.middle02.micro01.micro01.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ItemDto {

    private Long id;
    private String name;
    private int amount;
    private double price;

}
