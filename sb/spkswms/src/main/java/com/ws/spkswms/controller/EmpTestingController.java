package com.ws.spkswms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ws.spkswms.service.EmpTestingService;
import com.ws.spkswms.vo.EmpTestingVo;

public class EmpTestingController {

	@Autowired
	EmpTestingService TestingService;

	@RequestMapping("/EmpTesting/")
	public @ResponseBody List<EmpTestingVo> seleteSampleData(@ModelAttribute("searchVO") EmpTestingVo vo, ModelMap model) throws Exception {
		List<EmpTestingVo> eList = TestingService.selectSampleData(vo);

		System.out.println(eList);

		return TestingService.selectSampleData(vo);
	}
}