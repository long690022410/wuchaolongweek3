package com.chaolong.dao;

import java.util.List;

import com.chaolong.domain.Yu;
import com.chaolong.vo.QueryVO;

public interface YuDao {
	/**
	 * 
	 * @Title: insertYus 
	 * @Description: ����Ԥ����������
	 * @param list
	 * @return
	 * @return: int
	 */
	int insertYus(List<Yu> list);
	/**
	 * 
	 * @Title: selects 
	 * @Description: ����Ԥ��������ѯ
	 * @param vo
	 * @return
	 * @return: List<Yu>
	 */
	List<Yu> selects(QueryVO vo);
	/**
	 * 
	 * @Title: insertYu 
	 * @Description: ����Ԥ����������
	 * @param yu
	 * @return
	 * @return: int
	 */
	int insertYu(Yu yu);
	
	
}
