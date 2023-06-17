package com.ppis.service;

import com.ppis.dto.Entity1Dto;
import com.ppis.dto.Rs.AllEntity1RsDto;
import com.ppis.entity.Entity1;
import com.ppis.repository.Entity1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MainServiceImpl implements MainService {

    @Autowired
    Entity1Repository entity1Repository;
    @Override
    public AllEntity1RsDto GetAllEntity1() {
        return AllEntity1RsDto.builder()
                .list(entity1Repository.findAll())
                .build();
    }

    @Override
    public Entity1Dto GetById(int id) {
        return new Entity1Dto(entity1Repository.getById(id));
    }

    @Override
    public Entity1Dto AddEntity1(Entity1Dto entity1Dto) {
        return new Entity1Dto(entity1Repository.save(
                Entity1.builder()
                .p1(entity1Dto.getP1())
                .p2(entity1Dto.getP2())
                .p3(entity1Dto.getP3())
                .build()));
    }

    @Override
    public void DeleteById(int id) {
        entity1Repository.deleteById(id);
    }
}
