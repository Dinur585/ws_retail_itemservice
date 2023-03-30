package com.item.service;

import com.item.model.Item;
import com.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;


    public List<Item> getAllItemsList() {
        List<Item> itemList = itemRepository.findAll().stream().limit(20).collect(Collectors.toList());
        return itemList;
    }
}
