package kz.bitlab.middle02.micro01.micro01.service;

import kz.bitlab.middle02.micro01.micro01.dto.ItemDto;

import java.util.List;

public interface ItemService {

    List<ItemDto> getItems();
    ItemDto getItem(Long id);
    ItemDto addItem(ItemDto itemDto);
}
