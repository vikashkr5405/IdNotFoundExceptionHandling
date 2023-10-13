package com.vikash.IdNotFoundExceptionHandling;

import java.util.List;
import java.util.Optional;

public interface CustomerServcie
{
    public Customer AddDetails(Customer customer);
    public List<Customer> fetchAllDetails();
    public Optional<Customer> getFromId(int id);
}
