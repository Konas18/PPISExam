package com.ppis.service;

import com.ppis.dto.*;
import com.ppis.dto.Rs.*;

public interface MainService {
    AllEntity1RsDto GetAllEntity1();
    Entity1Dto GetById(int id);
    Entity1Dto AddEntity1(Entity1Dto entity1Dto);
    void DeleteById(int id);
}
