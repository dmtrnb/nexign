package ru.example.nexing.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "result")
@NoArgsConstructor
@AllArgsConstructor
public class Result extends IdEntity {

    private String name;
    private String city;
    private int age;
    private long sum;
}
