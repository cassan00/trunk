package com.ws.spkswms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ws.spkswms.dao.EmpTestingDao;
import com.ws.spkswms.vo.EmpTestingVo;

public class EmpTestingService implements EmpTestingServiceImp {

	@Autowired
	EmpTestingDao testingDao;

	@Override
	public List<EmpTestingVo> selectSampleData(EmpTestingVo vo) {
		// TODO Auto-generated method stub
		return testingDao.selectSampleData(vo);
	}

}
