/*
 * Copyright (c) 2022.
 * licebce MIT
 */

package org.casjedcem.FarmShop.Repository;


import org.casjedcem.commerce.entities.Category;
import org.casjedcem.commerce.entities.Product;
import org.casjedcem.commerce.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;




@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    public List<Product> findAllByCategory(Category category);
    public List<Product> findAllByCategoryAndNameLike(Category category, String name);
    public List<Product> findByNameContains(@Param("name") String name);
    public List<Product> findByVendorAndCategory(Vendor vendor, Category category);
    public List<Product> findByVendorAndAvailableIsTrue(Vendor v);
    public List<Product> findByVendorAndPromotionIsTrue(Vendor v);
    public List<Product> findByPromotionIsTrue();

    public List<Product> findByAvailableIsTrue();

}
