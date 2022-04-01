package com.tns.cg.smms.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.cg.smms.entities.Item;
import com.tns.cg.smms.repositories.ItemRepository;

@Service
@Transactional
public class ItemService {
	@Autowired
	// This means to get the bean which is auto-generated by Spring
	// We will use it to handle the data
	ItemRepository iRepository;

	// Retreiving all Items
	public List<Item> getAllItems() {
		return iRepository.findAll();
	}

	// Creating New item
	public void save(Item emp) {
		iRepository.save(emp);
	}

	// Retreiving item by id
	public Item getItemById(Integer id) {
		return iRepository.findById(id).get();
	}

	// Deleting item from database
	public void delete(Integer id) {
		iRepository.deleteById(id);
	}
}
