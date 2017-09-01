package com.dai.dshop.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dai.dshop.service.ItemService;


/**
 * 页面跳转
 * @author dfw19
 *
 */
@Controller
public class PageController {
	@Resource
	private ItemService itemSrv;
	
	/**
	 * 打开首页
	 * @return String 逻辑视图
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "index";		//自动根据spring-mvc中配置的前后缀拼
	}
	
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
}
