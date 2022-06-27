package ru.example.nexing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.example.nexing.domain.entity.Participant;

import java.util.UUID;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, UUID> {

    @Query(value = "select * from participant p order by p.id limit 1 offset ?1", nativeQuery = true)
    Participant getWinner(long offset);
}
