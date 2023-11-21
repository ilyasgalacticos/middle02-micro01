package kz.bitlab.middle02.micro01.micro01.api;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecondBean {

    public SecondBean(String beanName, int price){
        System.out.println("I AM USING PARAMETRIZED CONSTRUCTOR OF SECOND BEAN");
        this.beanName = beanName;
        this.price = price;
    }

    public SecondBean(){
        System.out.println("I AM USING DEFAULT CONSTRUCTOR OF SECOND BEAN");
        this.beanName = "Default Bean";
        this.price = 222;
    }

    private String beanName;
    private int price;

}
