package com.ppis.dto;

import com.ppis.entity.Entity1;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Entity1Dto {
    private int id;
    private String p1;
    private String p2;
    private int p3;

    public Entity1Dto (Entity1 entity1){
        this.id = entity1.getId();
        this.p1 = entity1.getP1();
        this.p2 = entity1.getP2();
        this.p3 = entity1.getP3();
    }
}
