package ru.example.nexing.domain.mapper;

public interface SuperMapper<E, D> {

    E fromDto(D dto);

    D toDto(E entity);
}
