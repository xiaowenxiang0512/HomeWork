package com.xwx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xwx.entity.Plan;

public interface PlanMapper {

	List<Plan> getList(@Param("mhname")String mhname);

	Plan getPlanBypid(@Param("pid")int pid);

	void xg(Plan plan,@Param("pid")int pid);

	void tj(Plan plan);

	void del(@Param("pid")String pid);

}
