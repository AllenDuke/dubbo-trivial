package com.github.AllenDuke;

import com.github.AllenDuke.producerService.RPCServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) throws Exception {
        RPCServer.startServer();
        SpringApplication.run(ProviderApplication.class, args);
    }

}
