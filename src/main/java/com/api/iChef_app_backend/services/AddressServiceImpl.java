package com.api.iChef_app_backend.services;

import com.api.iChef_app_backend.models.Address;
import com.api.iChef_app_backend.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address add(Address address) {
        return addressRepository.save(address);
    }
}
