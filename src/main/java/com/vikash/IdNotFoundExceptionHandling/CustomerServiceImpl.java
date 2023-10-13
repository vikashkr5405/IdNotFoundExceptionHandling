package com.vikash.IdNotFoundExceptionHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerServcie
{
    @Autowired
    CustomerRepository crepo;

    @Override
    public Customer AddDetails(Customer customer) {
        return crepo.save(customer);
    }

    @Override
    public List<Customer> fetchAllDetails() {
        return crepo.findAll();
    }

    @Override
    public Optional<Customer> getFromId(int id) {
        return Optional.ofNullable(crepo.findById(id).orElseThrow(() ->
                new IdNotFoundException("Customer Details was not found with id :- " + id)));
    }
}
