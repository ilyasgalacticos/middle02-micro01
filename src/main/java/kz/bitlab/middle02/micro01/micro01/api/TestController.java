package kz.bitlab.middle02.micro01.micro01.api;

import kz.bitlab.middle02.micro01.micro01.beans.FirstBean;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class TestController {

    private final FirstBean firstBean;
    private final SecondBean secondBean;

    @GetMapping
    public String test(){
        return firstBean.getName() + " " + firstBean.getAmount();
    }

    @GetMapping(value = "/second")
    public String testSecond(){
        return secondBean.getBeanName() + " " + secondBean.getPrice();
    }
}
