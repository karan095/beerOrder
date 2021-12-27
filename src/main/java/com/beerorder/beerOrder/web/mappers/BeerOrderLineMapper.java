package com.beerorder.beerOrder.web.mappers;

import com.beerorder.beerOrder.domain.BeerOrderLine;
import com.beerorder.beerOrder.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
