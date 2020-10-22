package com.dictation.service;

import com.dictation.mapper.EnrollMapper;
import com.dictation.vo.EnrollVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AcceptService {
	
	@Autowired
	private EnrollMapper enrollMapper;

	/**
	 * 내 수강신청 목록을 가져옵니다
	 * @param params - 강의번호
	 * @return List<Enroll> - 수강신청목록
	 */
	public List<Map<String, Object>> getList(Map<String, Object> params) {
		return enrollMapper.getList(params);
	}


}