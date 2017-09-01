package com.dai.dshop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dai.dshop.mapper.ItemMapper;
import com.dai.dshop.pojo.Item;
import com.dai.dshop.service.ItemService;

/**
 * 
 * @author dfw19
 *
 */
@Service
public class ItemServiceImpl implements ItemService{
	@Resource
	private ItemMapper itemDao;
	
	@Override
	public Item getItemById(long itemId) {
		Item item = itemDao.selectByPrimaryKey(itemId);
		if(item == null){
			
		}
		return item;
	}
	
	

}
