package com.jupiter.springblog.controllers.models;

import ch.qos.logback.classic.db.names.ColumnName;

import javax.persistence.*;

@Entity
@Table(name="dogs", uniqueConstraints = {
        @UniqueConstraint(ColumnNames = { "name", "reside_state"})
})
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(11) UNSIGNED")
    private long id;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String name;
}
