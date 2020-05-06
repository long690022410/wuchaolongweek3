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
	// ����service���������ɷ��� ����100��������ӵ����ݿ�
	@Test
	public void testInsertYus() {
		List<Yu> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			Yu yu = new Yu();
			// ����Ԥ������  ��2020��5��1�������������
			Calendar cal = Calendar.getInstance();
			cal.set(2020, 4, 1);
			yu.setDing(DateUtil.random(cal.getTime(), new Date()));
			// ����
			yu.setName(StringUtil.generateChineseName());
			// �ֻ� 11λ����
			String phone = "";
			for (int j = 0; j < 11; j++) {
				phone += RandomUtil.random(0, 9);
			}
			yu.setPhone(phone);
			// ����id
			yu.setId(RandomUtil.random(1, 3));
			// ��ע �������2-8������
			yu.setCom(StringUtil.randomChineseString(RandomUtil.random(2, 8)));
			list.add(yu);
		}
		// �������ɵļ���
		for (Yu y : list) {
			System.out.println(y);
		}
		// ������ݿ�
		service.insertYus(list);
	}

}
