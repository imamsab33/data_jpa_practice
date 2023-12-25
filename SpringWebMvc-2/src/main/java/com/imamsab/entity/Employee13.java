package com.imamsab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee13 {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Integer eid;
         private String name;
         private String companyName;
         private Integer salary;
         
}
