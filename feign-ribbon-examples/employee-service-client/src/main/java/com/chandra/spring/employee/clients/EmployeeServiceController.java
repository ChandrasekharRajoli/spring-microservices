package com.chandra.spring.employee.clients;

import org.springframework.beans.factory.annotation.Autowired;
public class EmployeeServiceController {
/*
 * 
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;


import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;

@Import(FeignClientsConfiguration.class)
    private EmployeeServiceClient employeeClient;
    

    @Autowired
    public EmployeeServiceController() {
        this.employeeServiceClient = Feign.builder().client(new RibbonClient()).target(EmployeeServiceClient.class, "https://myAppProd");
        
    }
    
    @Autowired
    public EmployeeServiceController(
            Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.employeeServiceClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .target(EmployeeServiceClient.class, "http://PROD-SVC");
        
    }*/
}
