package com.github.AllenDuke;

import com.github.AllenDuke.clientService.RPCClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) throws Exception {
        RPCClient.init();
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
