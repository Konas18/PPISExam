package com.ppis.dto.Rs;

import com.ppis.entity.Entity1;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class AllEntity1RsDto {
    private List<Entity1> list;
}
