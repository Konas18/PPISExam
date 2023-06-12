package com.ppis.service;

import com.ppis.dto.*;
import com.ppis.dto.Rs.*;

public interface MainService {
    AllEntity1RsDto GetAllEntity1();

    Entity1Dto GetById(GetByIdDto idDto);

    Entity1Dto AddEntity1(Entity1Dto entity1Dto);
}
