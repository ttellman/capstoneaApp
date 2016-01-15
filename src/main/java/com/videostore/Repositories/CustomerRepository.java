package com.videostore.Repositories;

import com.videostore.model.Customer;
import com.videostore.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Tim on 1/14/2016.
 */
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends CrudRepository<Customer, Short> {

    List<Customer> findCustomerByCustomerId(short customerId);
    void deleteCustomerByCustomerId(short customerId);
}
