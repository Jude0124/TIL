package com.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.dao.EmpDAOImpl;
import com.spring.deptdto.DeptDTO;
import com.spring.dto.EmpDTO;

@Controller
public class MyController {
	@Autowired
	private EmpDAOImpl dao;
	
	
	@RequestMapping("/select.do")
	public String list(Model model ) {
		
		List<EmpDTO> list = this.dao.list();
		model.addAttribute("total", list);
		
		return "emp_list";
	}
	
	@RequestMapping("/write.do")
	public String write(Model model) {
		List<DeptDTO> deptlist=
		this.dao.deptList();
		
		model.addAttribute("dept",deptlist);
		return "emp_write";
		
	}
	@RequestMapping("/writeOk.do")
	public String writeok(Model model, EmpDTO dto) {
		 this.dao.insert(dto);
		return "redirect:select.do";
	}
	@RequestMapping("/cont.do")
	public String cont(Model model, @RequestParam("no") int no) {
		EmpDTO dto = this.dao.cont(no);
		
		model.addAttribute("cont", dto);
		return "emp_cont";
	}
	@RequestMapping("/edit.do")
	public String edit(@RequestParam("no") int no, Model model) {
		List<DeptDTO> deptlist=
				this.dao.deptList();
		EmpDTO dto = this.dao.cont(no);
		model.addAttribute("cont", dto);
		model.addAttribute("dept", deptlist);
		return "emp_edit";
	}
	
	@RequestMapping("/editOk.do")
	public String editok(Model model,EmpDTO dto) {
		this.dao.update(dto);
		
		
		return "redirect:cont.do?no="+dto.getEmpno();
		
	}
	@RequestMapping("/delete.do")
	public String delete(Model model,@RequestParam("no") int no) {
		this.dao.delete(no);
		
		return "redirect:select.do";
	}
}
