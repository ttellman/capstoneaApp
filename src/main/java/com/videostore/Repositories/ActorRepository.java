package com.videostore.Repositories;

import com.videostore.model.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Tim on 1/14/2016.
 */
@RepositoryRestResource(collectionResourceRel = "actor", path = "actor")
public interface ActorRepository extends CrudRepository<Actor, Short> {

    List<Actor> findActorByActorId (short actorid);
}
