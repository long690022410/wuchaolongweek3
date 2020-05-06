package com.chaolong.dao;

import java.util.List;

import com.chaolong.domain.Yu;
import com.chaolong.vo.QueryVO;

public interface YuDao {
	/**
	 * 
	 * @Title: insertYus 
	 * @Description: 房间预订批量新增
	 * @param list
	 * @return
	 * @return: int
	 */
	int insertYus(List<Yu> list);
	/**
	 * 
	 * @Title: selects 
	 * @Description: 房间预订条件查询
	 * @param vo
	 * @return
	 * @return: List<Yu>
	 */
	List<Yu> selects(QueryVO vo);
	/**
	 * 
	 * @Title: insertYu 
	 * @Description: 房间预订单挑新增
	 * @param yu
	 * @return
	 * @return: int
	 */
	int insertYu(Yu yu);
	
	
}
