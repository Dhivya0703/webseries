package com.project.WebSeries.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.WebSeries.Model.WebSeries;

@Repository
public interface WebSeriesClassRepo extends CrudRepository<WebSeries, Integer>  {

}
