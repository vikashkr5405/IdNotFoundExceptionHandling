package com.vikash.IdNotFoundExceptionHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/add")
public class CustomerController
{
    @Autowired
    CustomerServcie cserv;

    @PostMapping
    public ResponseEntity<Customer> saved(@RequestBody Customer customer)
    {
        Customer c=cserv.AddDetails(customer);
        return new ResponseEntity<>(c, HttpStatus.ACCEPTED);
    }
    @GetMapping
    public ResponseEntity<List<Customer>> fetch()
    {
        return ResponseEntity.ok(cserv.fetchAllDetails());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Customer>> getById(@PathVariable int id)
    {
        return ResponseEntity.ok(cserv.getFromId(id));
    }
}
