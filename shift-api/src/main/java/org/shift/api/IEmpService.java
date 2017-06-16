package org.shift.api;

import java.util.List;

import org.shift.vo.Emp;

public interface IEmpService {
	public boolean add(Emp vo);
	public List<Emp> list();
}
