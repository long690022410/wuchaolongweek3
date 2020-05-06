package com.chaolong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chaolong.domain.Yu;
import com.chaolong.service.YuService;
import com.chaolong.vo.QueryVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class YuController {
	
	@Autowired
	private YuService service;
	@RequestMapping("show")
	public ModelAndView show(QueryVO vo,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "5") Integer pageSize) {
		ModelAndView mv = new ModelAndView("show");
		PageHelper.startPage(pageNum, pageSize);
		List<Yu> list = service.selects(vo);
		PageInfo<Yu> info = new PageInfo<>(list);
		mv.addObject("list", list);
		mv.addObject("info", info);
		
		mv.addObject("vo", vo);
		return mv;
	}
	
}
