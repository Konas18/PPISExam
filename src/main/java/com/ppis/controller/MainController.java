package com.ppis.controller;

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
    @GetMapping(path = "/getAll")
    public AllEntity1RsDto GetAll(){
        return mainService.GetAll();
    }

    //Get
//    @ApiOperation("Получение днища по id")
//    @PostMapping(path="/getBottomById", produces = MediaType.APPLICATION_JSON_VALUE)
//    public GetBottomByIdRsDto GetById(@RequestBody GetBottomByIdRqDto getBottomByIdRqDto) {
//        return mainService.GetBottomById(getBottomByIdRqDto);
//    }
//
//    //Add
//    @ApiOperation("Добавление цистерны")
//    @PostMapping(path="/addCistern", produces = MediaType.APPLICATION_JSON_VALUE)
//    public AddCisternRsDto Add(@RequestBody AddCisternRqDto addCisternRqDto){
//        return mainService.AddCistern(addCisternRqDto);
//    }
}
