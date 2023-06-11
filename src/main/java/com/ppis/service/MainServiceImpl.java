package com.ppis.service;

import com.ppis.dto.Rs.AllEntity1RsDto;
import com.ppis.repository.Entity1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MainServiceImpl implements MainService {

    @Autowired
    Entity1Repository entity1Repository;
    @Override
    public AllEntity1RsDto GetAll() {
        return AllEntity1RsDto.builder()
                .list(entity1Repository.findAll())
                .build();
    }
}
