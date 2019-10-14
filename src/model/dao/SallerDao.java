package model.dao;

import java.util.List;

import model.entities.Saller;

public interface SallerDao {

	void insert(Saller obj);
	void update(Saller obj);
	void delete(Integer id);
	Saller findById(Integer id);
	List<Saller> findAll();
}
