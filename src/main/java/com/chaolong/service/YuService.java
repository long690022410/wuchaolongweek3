package com.chaolong.service;

import java.util.List;

import com.chaolong.domain.Yu;
import com.chaolong.vo.QueryVO;

public interface YuService {
	
	int insertYus(List<Yu> list);
	
	List<Yu> selects(QueryVO vo);
	
	int insertYu(Yu yu);
	
	
}
