package com.xplore.web.service;

import java.util.List;

import com.xplore.web.dao.PlateEnglishDao;
import com.xplore.web.domain.PlateChinese;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.xplore.web.dao.PlateChineseDao;
import com.xplore.web.util.Page;

@org.springframework.stereotype.Service
@Transactional
public class PlateService {

	@Autowired
	PlateChineseDao plateChineseDao;

	@Autowired
	PlateEnglishDao plateEnglishDao;
	
	public Object getById(Integer id, boolean useChineseFlags){
		if(useChineseFlags)
			return plateChineseDao.get(id);
		else
			return plateEnglishDao.get(id);
	}
	
	public Page pagedList(Page page, boolean useChineseFlags){
		if(useChineseFlags) {
			page.setResult(plateChineseDao.pagedList(page).getResult());
			page.setTotalCount(plateChineseDao.getTotalCount());
		} else {
			page.setResult(plateEnglishDao.pagedList(page).getResult());
			page.setTotalCount(plateEnglishDao.getTotalCount());
		}
		return page;
	}

	public List getPlate(Integer plateId, boolean useChineseFlags) {
		int maxResults = 5;

		if(useChineseFlags)
			return plateChineseDao.getPlate(plateId, 5);
		else
			return plateEnglishDao.getPlate(plateId, 5);
	}

}
