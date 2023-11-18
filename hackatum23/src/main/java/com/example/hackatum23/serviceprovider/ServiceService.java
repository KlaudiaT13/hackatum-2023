package com.example.hackatum23.serviceprovider;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {

    public List<ServiceProvider> getServiceProvidersByPostalCode(String postalCode) {
        // Implement the logic to retrieve service providers based on the postal code
        // Example: return a list of service providers with matching postal codes
        // For simplicity, assume the postalCode is a property of ServiceProvider
        return serviceProviderList.stream()
            .filter(provider -> provider.getPostalCode().equals(postalCode))
            .collect(Collectors.toList());
    }

}
