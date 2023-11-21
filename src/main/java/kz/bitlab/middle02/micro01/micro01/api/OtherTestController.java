package kz.bitlab.middle02.micro01.micro01.api;

import kz.bitlab.middle02.micro01.micro01.beans.FirstBean;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/other-test")
@RequiredArgsConstructor
public class OtherTestController {

    private final FirstBean firstBean;

    @GetMapping
    public String test(){
        firstBean.setName("Ilyas");
        firstBean.setAmount(88);
        return firstBean.getName() + " " + firstBean.getAmount();
    }
}
