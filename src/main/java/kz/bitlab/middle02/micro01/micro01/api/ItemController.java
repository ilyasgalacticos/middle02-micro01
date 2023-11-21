package kz.bitlab.middle02.micro01.micro01.api;

import kz.bitlab.middle02.micro01.micro01.dto.ItemDto;
import kz.bitlab.middle02.micro01.micro01.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/item")
public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public List<ItemDto> getItems(){
        return itemService.getItems();
    }

    @GetMapping(value = "/{id}")
    public ItemDto getItem(@PathVariable(name = "id") Long id){
        return itemService.getItem(id);
    }

    @PostMapping
    public ItemDto addItem(@RequestBody ItemDto itemDto){
        return itemService.addItem(itemDto);
    }

}
