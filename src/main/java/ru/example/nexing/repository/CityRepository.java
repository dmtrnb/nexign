package ru.example.nexing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.example.nexing.domain.entity.City;

import java.util.UUID;

@Repository
public interface CityRepository extends JpaRepository<City, UUID> {

    boolean existsByName(String name);

    City findByName(String name);
}
