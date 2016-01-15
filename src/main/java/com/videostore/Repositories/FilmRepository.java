package com.videostore.Repositories;

import com.videostore.model.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Tim on 1/14/2016.
 */
@RepositoryRestResource(collectionResourceRel = "film", path = "film")
public interface FilmRepository extends CrudRepository<Film, Short>{

    List<Film> findFilmByFilmId (short filmId);

}
