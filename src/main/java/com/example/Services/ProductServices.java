package com.example.Services;

import com.example.Model.School;
import com.example.Model.product;
import com.example.Repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {


    @Autowired
    private productRepository productRepository;



    public List<product> getAllproduct(){
        return productRepository.findAll();
    }

    public Optional<product> getParoductById(long id){
        return Optional.ofNullable(productRepository.findById(id).orElse(null));
    }

   public product addproduct(product product){
        return productRepository.save(product);
   }

  public product updateProduct(product pro){
        return productRepository.save(pro);
  }

  public boolean deleteProduct(long id){
        boolean bol = false;
        if (productRepository.existsById(id)){
            productRepository.deleteById(id);
            return true;
        }else
            return false;
  }



}
