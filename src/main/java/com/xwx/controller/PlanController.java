package com.xwx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xwx.entity.Plan;
import com.xwx.service.PlanService;

@Controller
public class PlanController {

	@Autowired
	PlanService service;
	
	@RequestMapping("list")
	private String getList(Model model,String mhname,@RequestParam(defaultValue="1")int pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<Plan> list = service.getList(mhname);
		PageInfo<Plan> info = new PageInfo<>(list);
		model.addAttribute("list", list);
		model.addAttribute("info", info);
		model.addAttribute("mhname", mhname);
		return "list";
	}
	
	@RequestMapping("xq")
	private String getPlanBypid(int pid,Model model) {
		Plan plan = service.getPlanBypid(pid);
		model.addAttribute("p", plan);
		return "xq";
	}
	
	@RequestMapping("xg")
	private String xggetPlanBypid(int pid,Model model) {
		Plan plan = service.getPlanBypid(pid);
		model.addAttribute("p", plan);
		return "xg";
	}
	
	@RequestMapping("gai")
	private String gai(Plan plan,int pid) {
		service.xg(plan,pid);
		return "redirect:/list";
	}
	
	@RequestMapping("toadd")
	private String toadd() {
		return "add";
	}
	
	@RequestMapping("tj")
	private String tj(Plan plan) {
		service.tj(plan);
		return "redirect:/list";
	}
	
	@RequestMapping("del")
	private String del(String pid) {
		service.del(pid);
		return "redirect:/list";
	}
	
}
