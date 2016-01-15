package com.videostore.Repositories;


import com.videostore.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Tim on 1/14/2016.
 */
@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepository extends CrudRepository<Category, Byte> {

    List<Category> findCategoryByCategoryId (byte categoryId);


}
