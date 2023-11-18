package com.example.hackatum23.serviceprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/serviceProvider")
public class ServiceController {

    private final ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping //annotate at RESTful endpoint (get something out from server)
    public List<ServiceProvider> getServiceProvider(@RequestParam(name = "postalCode") String postalCode) {
        // Use the postal code in your service logic
        List<ServiceProvider> serviceProviderList = serviceService.getServiceProvidersByPostalCode(postalCode);
        return serviceProviderList;
    }
}
