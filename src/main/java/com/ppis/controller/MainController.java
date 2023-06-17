package com.ppis.controller;

import com.ppis.dto.Entity1Dto;
import com.ppis.dto.Rs.AllEntity1RsDto;
import com.ppis.service.MainService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping("/main")
@CrossOrigin(origins = "http://localhost:4200")
@ControllerAdvice
public class MainController extends ResponseEntityExceptionHandler {

    @Autowired
    MainService mainService;

    //FindAll
    @ApiOperation("Получение списка всех объектов")
    @GetMapping(path = "/getAllEntity1")
    public AllEntity1RsDto GetAllEntity1(){
        return mainService.GetAllEntity1();
    }

    //Get
    @ApiOperation("Получение Entity1 по id")
    @GetMapping(path="/getEntity1ById/{id}")
    public Entity1Dto GetEntity1ById(@PathVariable int id) {
        return mainService.GetById(id);
    }

    //Add
    @ApiOperation("Добавление энтити")
    @PostMapping(path="/addEntity1", produces = MediaType.APPLICATION_JSON_VALUE)
    public Entity1Dto AddEntity1(@RequestBody Entity1Dto entity1Dto){
        return mainService.AddEntity1(entity1Dto);
    }

    //Get
    @ApiOperation("Удаление Entity1 по id")
    @DeleteMapping(path="/deleteEntity1ById/{id}")
    public void DeleteEntity1ById(@PathVariable int id) {
        mainService.DeleteById(id);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "Сущность не найдена";
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
}
