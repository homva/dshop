package com.dai.dshop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dai.dshop.common.pojo.EUDataGridItemResult;
import com.dai.dshop.mapper.ItemMapper;
import com.dai.dshop.pojo.Item;
import com.dai.dshop.pojo.ItemExample;
import com.dai.dshop.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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

	@Override
	public EUDataGridItemResult getItemList(int pageNum, int pageSize) {
		ItemExample example = new ItemExample();
		PageHelper.startPage(pageNum, pageSize);
		List<Item> items = itemDao.selectByExample(example);
		PageInfo<Item> info = new PageInfo<Item>(items);
		
		EUDataGridItemResult result = new EUDataGridItemResult();
		result.setRows(items);
		result.setTotal(info.getTotal());
		return result;
	}
	
	

}
