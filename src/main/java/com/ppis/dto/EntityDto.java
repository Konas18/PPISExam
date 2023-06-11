package com.ppis.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EntityDto {
    private int id;
    private String p1;
    private String p2;
    private int p3;
}
