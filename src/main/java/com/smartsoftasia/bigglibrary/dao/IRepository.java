package com.smartsoftasia.bigglibrary.dao;

import java.util.List;

public interface IRepository<T> {
	

	List<T> GetAll();
	T GetById(int id);
	
	void Add(T entite);
	void Update(T entite);
	void Delete(T entite);
	void DeleteAll();
	void Refresh(T entite);
    void CreateOrUpdate(T entite);
	
}
