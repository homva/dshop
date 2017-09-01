package com.dai.dshop.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dai.dshop.common.pojo.EUTreeNode;
import com.dai.dshop.mapper.ItemCatMapper;
import com.dai.dshop.pojo.ItemCat;
import com.dai.dshop.pojo.ItemCatExample;
import com.dai.dshop.pojo.ItemCatExample.Criteria;
import com.dai.dshop.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Resource
	private ItemCatMapper itemCatDao;
	
	@Override
	public List<EUTreeNode> getCatList(long parentId) {
		ItemCatExample example = new ItemCatExample();
		Criteria c = example.createCriteria();
		c.andParentIdEqualTo(parentId);
		
		List<ItemCat> cats = itemCatDao.selectByExample(example);
		List<EUTreeNode> nodes = new ArrayList<EUTreeNode>();
		for (ItemCat itemCat : cats) {
			EUTreeNode node = new EUTreeNode(itemCat.getId(), itemCat.getName(), itemCat.getIsParent() ? "closed":"open");
			nodes.add(node);
		}
		return nodes;
	}

}
