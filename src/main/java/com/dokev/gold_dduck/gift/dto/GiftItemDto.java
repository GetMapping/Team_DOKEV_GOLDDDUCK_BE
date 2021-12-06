package com.dokev.gold_dduck.gift.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class GiftItemDto {

    private Long id;

    private String giftType;

    private String content;

    private boolean used;

    public GiftItemDto(Long id, String giftType, String content, boolean used) {
        this.id = id;
        this.giftType = giftType;
        this.content = content;
        this.used = used;
    }
}
