package org.shift.action;

import javax.annotation.Resource;

import org.shift.api.IEmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages/back/admin/emp/*")
public class EmpAction {
	@Resource
	private IEmpService empService;
	@RequestMapping("emp_list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("allEmps", this.empService.list());
		return mav;
	}
}
