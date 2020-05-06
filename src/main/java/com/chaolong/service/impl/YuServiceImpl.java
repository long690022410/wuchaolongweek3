package com.chaolong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chaolong.dao.YuDao;
import com.chaolong.domain.Yu;
import com.chaolong.service.YuService;
import com.chaolong.vo.QueryVO;
@Service
public class YuServiceImpl implements YuService {
	@Autowired
	private YuDao dao;

	@Override
	public int insertYus(List<Yu> list) {
		// TODO Auto-generated method stub
		return dao.insertYus(list);
	}
	// 对于查询使用只读事务
	@Transactional
	@Override
	public List<Yu> selects(QueryVO vo) {
		// TODO Auto-generated method stub
		return dao.selects(vo);
	}

	@Override
	public int insertYu(Yu yu) {
		// TODO Auto-generated method stub
		return dao.insertYu(yu);
	}
	
	
	
	
}
