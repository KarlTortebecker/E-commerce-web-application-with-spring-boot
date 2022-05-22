/*
 * Copyright (c) 2022.
 * licebce MIT
 */
package org.casjedcem.FarmShop.Controller;


import org.casjedcem.FarmShop.Model.OrderItem;
import org.casjedcem.FarmShop.Model.Product;
import org.casjedcem.FarmShop.Repository.CategoryRepository;
import org.casjedcem.FarmShop.Repository.ProductRepository;
import org.casjedcem.FarmShop.Repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository ;

    @Autowired
    private VendorRepository vendorRepository  ;

    @GetMapping(path = "", produces = "application/json")
    public List<Product>  getAll(){

        return productRepository.findAll();

    }

    @PostMapping(path = "/{idCategory}/{idVendor}", consumes = "appliction/json" ,produces = "application/json")
    public Product  createProduct(@RequestBody Product product,
                                  @PathVariable("idCategory") Long idCategory,
                                  @PathVariable("idVendor") Long idVendor){

        product.setCategory(categoryRepository.getById(idCategory));
        product.setVendor(vendorRepository.getById(idVendor));
        return productRepository.save(product);

    }



}
