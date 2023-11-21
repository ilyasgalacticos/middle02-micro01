package kz.bitlab.middle02.micro01.micro01.config;

import kz.bitlab.middle02.micro01.micro01.api.SecondBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public SecondBean secondBean(){
        return new SecondBean();
    }

}
