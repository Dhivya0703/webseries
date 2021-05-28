package com.project.WebSeries.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.WebSeries.Model.WebSeries;
import com.project.WebSeries.Service.WebSeriesService;

@RestController
public class WebSeriesController {

	@Autowired
	WebSeriesService webservice;
	@PostMapping("/addwebseries")  
	private int saveBook(@RequestBody WebSeries series)   
	{  
	webservice.saveOrUpdate(series);  
	return series.getId();  
	}  
	@GetMapping("/getwebseries")  
	private List<WebSeries> getAllSeries()   
	{  
	return webservice.getAllSeries();  
	}  
	@GetMapping("/series/{seriesid}")  
	private WebSeries getSeries(@PathVariable("seriesid") int seriesid)   
	{  
	return webservice.getSeriesById(seriesid);  
	}  
	@DeleteMapping("/series/{seriesid}")  
	private String deleteBook(@PathVariable("seriesid") int seriesid)   
	{  
	webservice.delete(seriesid); 
	String name="series removed! "+seriesid;
	return name;
	}  
	@PutMapping("/series")  
	private WebSeries update(@RequestBody WebSeries series)   
	{  
	webservice.saveOrUpdate(series);  
	return series;  
	}  
}
