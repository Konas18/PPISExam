package com.ppis.controller;

import com.ppis.dto.Entity1Dto;
import com.ppis.dto.GetByIdDto;
import com.ppis.dto.Rs.AllEntity1RsDto;
import com.ppis.service.MainService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    @Autowired
    MainService mainService;

    //FindAll
    @ApiOperation("Получение списка всех объектов")
    @GetMapping(path = "/getAllEntity1")
    public AllEntity1RsDto GetAll(){
        return mainService.GetAllEntity1();
    }

    //Get
    @ApiOperation("Получение Entity1 по id")
    @PostMapping(path="/getEntity1ById", produces = MediaType.APPLICATION_JSON_VALUE)
    public Entity1Dto GetById(@RequestBody GetByIdDto getByIdDto) {
        return mainService.GetById(getByIdDto);
    }

    //Add
    @ApiOperation("Добавление энтити")
    @PostMapping(path="/addEntity1", produces = MediaType.APPLICATION_JSON_VALUE)
    public Entity1Dto Add(@RequestBody Entity1Dto entity1Dto){
        return mainService.AddEntity1(entity1Dto);
    }
}
