package com.moya.backend.models.services.interfaces;

import java.util.List;

import com.moya.backend.models.entity.Club;

public interface IClubService {

	public Club findById(Long id);
	public List<Club> findAll();
}
