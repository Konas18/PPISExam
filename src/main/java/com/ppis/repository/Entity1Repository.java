package com.ppis.repository;

import com.ppis.entity.Entity1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Entity1Repository extends JpaRepository<Entity1, Integer> {
    @Override
    List<Entity1> findAll();

    Entity1 getById(int id);

//    @Query("SELECT l FROM Level l JOIN FETCH l.idCisterns WHERE l.id = :id")
//    Entity1 getLevelByIdFetchCistern(int id);
}
