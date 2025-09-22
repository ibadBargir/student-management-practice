package com.example.Controller;

import com.example.Model.product;
import com.example.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/products")
    public List<product> getAllProduct(){
        return productServices.getAllproduct();
    }

    @GetMapping("/products/{id}")
    public product getProductbyid(@PathVariable long id){
        return productServices.getParoductById(id).orElse(null);
    }

    @PostMapping("/products/{id}")
    public product addproduc(@RequestBody product product , @PathVariable long id){
        product.setProductid(id);
        return productServices.addproduct(product);
    }

    @PutMapping("/products/{id}")
    public product updateProducs(@RequestBody product product , @PathVariable long id){
        product.setProductid(id);
        return productServices.updateProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public boolean delete(long id){
        return productServices.deleteProduct(id);
    }
}
