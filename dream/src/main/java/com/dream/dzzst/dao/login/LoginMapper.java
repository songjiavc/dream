package com.dream.dzzst.dao.login;

import java.util.List;
import java.util.Map;

import com.dream.dzzst.model.login.StationDto;

public interface LoginMapper {
	public List<StationDto> getLoginUser(Map loginInfo);
}
