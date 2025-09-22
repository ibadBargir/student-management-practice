package com.example.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class product {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private  long productid;

  private String product_name;

  private String Categery;


    public long getProductid() {
        return productid;
    }

    public void setProductid(long productid) {
        this.productid = productid;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategery() {
        return Categery;
    }

    public void setCategery(String categery) {
        Categery = categery;
    }
}
