package com.dai.dshop.service;

import com.dai.dshop.pojo.Item;

public interface ItemService {
	/**
	 * 根据itemid获取item数据
	 * @param itemId
	 * @return
	 */
	public Item getItemById(long itemId);
}
