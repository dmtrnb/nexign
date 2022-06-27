package ru.example.nexing.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "participant")
public class Participant extends IdEntity {

    @OneToOne(cascade = CascadeType.ALL)
    private Name name;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private City city;
    private int age;
}
