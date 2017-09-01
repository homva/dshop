package test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dai.dshop.mapper.ItemMapper;
import com.dai.dshop.pojo.Item;
import com.dai.dshop.pojo.ItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class PageHelperTest {
	
	@Test
	public void test(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application-*.xml");
		ItemMapper itemDao = context.getBean(ItemMapper.class);
		ItemExample example = new ItemExample();
		
		PageHelper.startPage(1, 10);
		List<Item> list = itemDao.selectByExample(example);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle());
		}
		PageInfo<Item> info = new PageInfo<Item>(list);
		System.out.println("共有商品信息："+info.getTotal());
	}
	
}
