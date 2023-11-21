package kz.bitlab.middle02.micro01.micro01.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Getter
@Setter
public class FirstBean {

    public FirstBean(){
        System.out.println("I am initializing first bean");
        name = "Hello";
        amount = 40;
    }

    private String name;
    private int amount;

}
