package com.item.controller;

import com.item.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.item.repository.ItemRepository;
import com.item.service.ItemService;

import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    ItemService itemService;


    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems() {
      List<Item> itemList = itemService.getAllItemsList();
        return new ResponseEntity<>(itemList, HttpStatus.OK);
    }


}
