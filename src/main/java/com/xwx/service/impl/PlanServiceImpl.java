package com.xwx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwx.entity.Plan;
import com.xwx.mapper.PlanMapper;
import com.xwx.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	PlanMapper mapper;
	@Override
	public List<Plan> getList(String mhname) {
		return mapper.getList(mhname);
	}
	
	@Override
	public Plan getPlanBypid(int pid) {
		return mapper.getPlanBypid(pid);
	}
	
	@Override
	public void xg(Plan plan,int pid) {
		mapper.xg(plan,pid);
	}
	
	
	@Override
	public void tj(Plan plan) {
		mapper.tj(plan);
	}
	
	@Override
	public void del(String pid) {
		mapper.del(pid);
	}
	
}
