package org.shift.service.impl;

import java.util.List;

import org.shift.api.IEmpService;
import org.shift.dao.IEmpDAO;
import org.shift.vo.Emp;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements IEmpService {
//	@Resource
	private IEmpDAO empDAO;
	public List<Emp> list() {
		return empDAO.findAll();
	}

}
