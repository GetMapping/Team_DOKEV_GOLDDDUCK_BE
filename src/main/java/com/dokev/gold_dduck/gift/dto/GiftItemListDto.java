package com.dokev.gold_dduck.gift.dto;

import com.dokev.gold_dduck.common.PaginationDto;
import java.util.List;
import lombok.Getter;
import org.springframework.data.domain.Page;

@Getter
public class GiftItemListDto {

    private List<GiftItemDetailDto> giftItemList;

    private PaginationDto pagination;

    public GiftItemListDto(Page<GiftItemDetailDto> page) {
        this.giftItemList = page.getContent();
        this.pagination = new PaginationDto(page);
    }
}
