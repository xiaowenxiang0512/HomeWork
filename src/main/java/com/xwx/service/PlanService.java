package com.xwx.service;

import java.util.List;

import com.xwx.entity.Plan;

public interface PlanService {

	List<Plan> getList(String mhname);

	Plan getPlanBypid(int pid);

	void xg(Plan plan, int pid);

	void tj(Plan plan);

	void del(String pid);

}
