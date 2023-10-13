package com.vikash.IdNotFoundExceptionHandling;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Integer>
{
    public Customer getById(int id);
}
