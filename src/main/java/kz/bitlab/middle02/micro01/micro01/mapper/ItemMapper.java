package kz.bitlab.middle02.micro01.micro01.mapper;

import kz.bitlab.middle02.micro01.micro01.dto.ItemDto;
import kz.bitlab.middle02.micro01.micro01.model.ItemModel;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDto toDto(ItemModel itemModel);
    ItemModel toEntity(ItemDto itemDto);
    List<ItemDto> toItemDtoList(List<ItemModel> itemModels);

}
