package com.project.WebSeries.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.WebSeries.Model.WebSeries;
import com.project.WebSeries.Repo.WebSeriesClassRepo;

@Service
public class WebSeriesService {

	@Autowired
	WebSeriesClassRepo webrepo;
	public void saveOrUpdate(WebSeries series) {
		webrepo.save(series);
		
	}
	public List<WebSeries> getAllSeries() {
		List<WebSeries> series = new ArrayList<WebSeries>();  
		webrepo.findAll().forEach(series1 -> series.add(series1));  
		return series;  
	}
	public WebSeries getSeriesById(int seriesid) {
		return webrepo.findById(seriesid).get();  
	}
	public void delete(int seriesid) {
		webrepo.deleteById(seriesid);  
	}
	public void update(WebSeries series, int seriesid)   
	{  
	webrepo.save(series);  
	}  

}
