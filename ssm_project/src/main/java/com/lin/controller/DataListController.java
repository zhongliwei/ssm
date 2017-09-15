package com.lin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lin.bean.Admin;
import com.lin.bean.PageModel;
import com.lin.service.PageModelService;

@Controller
public class DataListController {

	@Autowired
	private PageModelService pagemodelservice; 

	@RequestMapping(value="/list/{pageNo}")
	public  ModelAndView findAdmins(@PathVariable("pageNo") int pageNo,HttpServletRequest request) {
		
		if("".equals(pageNo)){
			pageNo = 1;
		}
		//默认每一页显示10条数据
		int pageSize =18;
		
		//参数pageNo表示当前是第几页 
		PageModel<Admin> pageModel = pagemodelservice.findAdmins(pageNo, pageSize);
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageModel", pageModel);
		mav.setViewName("dataList");

		return mav;
	}
}
