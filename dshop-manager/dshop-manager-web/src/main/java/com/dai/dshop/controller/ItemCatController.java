package com.dai.dshop.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dai.dshop.common.pojo.EUTreeNode;
import com.dai.dshop.service.ItemCatService;
import com.dai.dshop.service.ItemService;

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
	@Resource
	private ItemService itemSrv;
	@Resource
	private ItemCatService catSrv;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<EUTreeNode> getCats(@RequestParam(value = "id", defaultValue = "0") long parentId) {
		List<EUTreeNode> nodes = catSrv.getCatList(parentId);
		return nodes;
	}
		//方法2 ：map
//	public List<Map> getCats(@RequestParam(value="id",defaultValue="0")long parentId){
//		List<Map> list = new ArrayList<Map>();
//		List<EUTreeNode> nodes = catSrv.getCatList(parentId);
//		for (EUTreeNode euTreeNode : nodes) {
//			Map map = new HashMap<>();
//			map.put("id", euTreeNode.getId());
//			map.put("text", euTreeNode.getText());
//			map.put("state", euTreeNode.getState());
//			list.add(map);
//		}
//		return list;
//	}
	
	
	
	
	
}
