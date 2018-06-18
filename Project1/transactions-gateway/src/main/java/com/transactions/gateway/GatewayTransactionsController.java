package com.transactions.gateway;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayTransactionsController {

    @Autowired
    Environment environment;
    
    @RequestMapping(value = "/transactions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> transactions() {
        String time = Instant.now().toString();
        String port = environment.getProperty("local.server.port");
        String data = "Server Time : "+time+" - Port :"+port;
        List<String> list = new ArrayList<>();
        list.add("GatewayTransactions");
        list.add(data);
        return list;
    }
}
