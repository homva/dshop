package com.dai.dshop.service;

import com.dai.dshop.common.pojo.EUDataGridItemResult;
import com.dai.dshop.pojo.Item;

public interface ItemService {
	/**
	 * 根据itemid获取item数据
	 * @param itemId
	 * @return
	 */
	public Item getItemById(long itemId);
	
	/**
	 * 查询商品列表
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public EUDataGridItemResult getItemList(int pageNum,int pageSize);
}
