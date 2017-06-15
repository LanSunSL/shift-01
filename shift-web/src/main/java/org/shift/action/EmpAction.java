package org.shift.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages/back/admin/emp/*")
public class EmpAction {
	@RequestMapping("emp_list")
	public ModelAndView list() {
		System.err.println("列表操作");
		return null;
	}
}
