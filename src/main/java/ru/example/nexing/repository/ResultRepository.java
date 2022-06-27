package ru.example.nexing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.example.nexing.domain.entity.Result;

import java.util.UUID;

@Repository
public interface ResultRepository extends JpaRepository<Result, UUID> {
}
