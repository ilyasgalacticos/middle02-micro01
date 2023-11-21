package kz.bitlab.middle02.micro01.micro01.service;

import kz.bitlab.middle02.micro01.micro01.dto.ItemDto;
import kz.bitlab.middle02.micro01.micro01.mapper.ItemMapper;
import kz.bitlab.middle02.micro01.micro01.repsoitory.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    public List<ItemDto> getItems(){
        return itemMapper.toItemDtoList(itemRepository.findAll());
    }

    public ItemDto getItem(Long id){
        return itemMapper.toDto(itemRepository.findById(id).orElse(null));
    }

    public ItemDto addItem(ItemDto itemDto){
        return itemMapper.toDto(itemRepository.save(itemMapper.toEntity(itemDto)));
    }
}
