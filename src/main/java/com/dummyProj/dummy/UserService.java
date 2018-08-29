package com.dummyProj.dummy;
import com.dummyProj.dummy.User;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String callService() {
        RestTemplate restTemplate = new RestTemplate();
        User user= restTemplate.getForObject("http://localhost:8080/findById?id=5b7d3b5f700a5511b4620e24", User.class);
        String str=user.toString();
        System.out.println(str);

        return str;

    }
}
