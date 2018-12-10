package com.zbflcy.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by curry on 18-12-10.
 */
@Entity
@Data
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

}
