package com.a307.befresh.module.domain.food.dto.response;

import java.time.LocalDateTime;
import lombok.Builder;

@Builder
public record FoodListDetailRes(
    Long id,
    String name,
    String image,
    LocalDateTime expirationDate,   // TODO : 빼기
    LocalDateTime regDttm,
    int elapsedTime,
    String refresh,
    String ftype,
    Double freshState
) {
}
