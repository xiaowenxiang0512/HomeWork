package com.xwx.demo;

import java.io.IOException;
import java.util.List;
import org.junit.Test;
import com.xwx.entity.Plan;
import com.xwx.common.utils.FileUtil;


public class InsertFile {

	/*//读取文件
		@Test
		public void testReadLines() throws IOException {
			
			List<String> lines = FileUtil.readByLines("E:\\新建文本文档.txt");
			
			lines.forEach(x->{System.out.println(" x is " + x);});
			
			for (String string : lines) {
				String[] split = string.split("||");
				//添加
				Plan plan =  new Plan();
				plan.setPname(split[1]);//下标从零开始,第一个就是pname
				plan.setAmount(split[2]);//投资金额
				plan.setManager(split[3]);//分管领导
				plan.setContent(split[4]);//投资说明
				plan.setDid(split[5]);//部门id
				System.out.println(plan);
			}
			
		}*/
	
}