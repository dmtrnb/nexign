package ru.example.nexing.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "participant")
public class Participant extends IdEntity {

    @OneToOne
    private Name name;
    @ManyToOne
    private City city;
    private int age;
}
