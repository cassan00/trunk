package com.ws.spkswms.service;

import java.util.List;

import com.ws.spkswms.vo.EmpTestingVo;

/* INTERFACE */
public interface EmpTestingServiceImp {
	List<EmpTestingVo> selectSampleData(EmpTestingVo vo);

}
