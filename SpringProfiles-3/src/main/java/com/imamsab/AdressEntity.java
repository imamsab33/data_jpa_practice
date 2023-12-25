package com.imamsab;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "adress1")
public class AdressEntity {
       @Id
       private Integer adressNo;
       private String Street;
       private String tName;
       private String state;
       
       private Integer eid;
}
