package com.videostore.Repositories;

import com.videostore.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Tim on 1/14/2016.
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<Users, Short> {

    List<Users> findUsersByCustomerId(short customerId);
}
