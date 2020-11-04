package com.model;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER_TBL")
public class Customer {
   @Id
   @Column(name = "CUST_ID")
   private Long id;

   @Column(name = "NAME")
   private String name;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
