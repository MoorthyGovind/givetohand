package com.give2hand.service;

import java.util.List;

import com.give2hand.dto.SchemeChartDto;
import com.give2hand.entity.DonationScheme;

public interface DonationSchemeService {

	public List<DonationScheme> getAllSchemes();
	
	public List<SchemeChartDto> getStatisticsForScheme();
}
