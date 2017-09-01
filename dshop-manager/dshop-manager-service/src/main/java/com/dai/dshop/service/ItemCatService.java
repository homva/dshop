package com.dai.dshop.service;

import java.util.List;

import com.dai.dshop.common.pojo.EUTreeNode;

public interface ItemCatService {
	/**
	 * 根据parentid获取子节点列表
	 * @param parentId
	 * @return
	 */
	public List<EUTreeNode> getCatList(long parentId);
}
