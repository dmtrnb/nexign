package ru.example.nexing.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "result")
public class Result extends IdEntity {

    @OneToOne
    private Participant winner;
    private int sum;
}
