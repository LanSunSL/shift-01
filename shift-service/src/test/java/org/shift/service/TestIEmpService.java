package org.shift.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.shift.api.IEmpService;
import org.shift.vo.Emp;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestIEmpService {
	@Resource
	private IEmpService empService ;
	
	@Test
	public void testList() {
		System.out.println(this.empService.list());
	}
	@Test
	public void testAdd() {
		Emp vo = new Emp();
		vo.setName("test001");
		vo.setSex(1);
		vo.setPhone("1232314124");
		System.out.println(this.empService.add(vo));
	}
}
