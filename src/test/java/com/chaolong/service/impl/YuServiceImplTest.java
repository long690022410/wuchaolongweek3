package com.chaolong.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chaolong.domain.Yu;
import com.chaolong.service.YuService;
import com.chaolong.utils.DateUtil;
import com.chaolong.utils.RandomUtil;
import com.chaolong.utils.StringUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class YuServiceImplTest {
	@Autowired
	private YuService service;
	// 测试service的批量生成方法 生成100条数据添加到数据库
	@Test
	public void testInsertYus() {
		List<Yu> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			Yu yu = new Yu();
			// 房间预订日期  从2020年5月1日至今随机生成
			Calendar cal = Calendar.getInstance();
			cal.set(2020, 4, 1);
			yu.setDing(DateUtil.random(cal.getTime(), new Date()));
			// 姓名
			yu.setName(StringUtil.generateChineseName());
			// 手机 11位数字
			String phone = "";
			for (int j = 0; j < 11; j++) {
				phone += RandomUtil.random(0, 9);
			}
			yu.setPhone(phone);
			// 房型id
			yu.setId(RandomUtil.random(1, 3));
			// 备注 随机生成2-8个汉字
			yu.setCom(StringUtil.randomChineseString(RandomUtil.random(2, 8)));
			list.add(yu);
		}
		// 遍历生成的集合
		for (Yu y : list) {
			System.out.println(y);
		}
		// 添加数据库
		service.insertYus(list);
	}

}
