package com.dai.dshop.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dai.dshop.common.pojo.EUDataGridItemResult;
import com.dai.dshop.pojo.Item;
import com.dai.dshop.service.ItemService;

@Controller
public class ItemController {
	@Resource
	private ItemService itemSrv;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public Item getItemById(@PathVariable Long itemId){
		Item item = itemSrv.getItemById(itemId);
		return item;
	}
	
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridItemResult listItemByPage(int page,int rows){
		EUDataGridItemResult result = itemSrv.getItemList(page, rows);
		return result;
	}
	
}
