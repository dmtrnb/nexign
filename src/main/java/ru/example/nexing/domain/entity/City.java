package ru.example.nexing.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "city")
public class City extends IdEntity{

    private String name;
}
