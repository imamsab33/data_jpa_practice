package com.imamsab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Employee")

public class Course {
@Id
private Integer eno;
private String ename;
private String dept;
}
