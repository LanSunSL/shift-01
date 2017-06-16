package org.shift.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shift.api.IEmpService;
import org.shift.dao.IEmpDAO;
import org.shift.vo.Emp;
import org.springframework.stereotype.Service;
@Service("empService")
public class EmpServiceImpl implements IEmpService {
	@Resource
	private IEmpDAO empDAO ;
	@Override
	public boolean add(Emp vo) {
		return empDAO.doCreate(vo);
	}

	public List<Emp> list() {
		return empDAO.findAll();
	}
	

}
