package com.java.programmer.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.programmer.entity.FoodCategory;
/**
 * 菜品分类信息dao
 * 
 *
 */
@Repository
public interface FoodCategoryDao {
	public int add(FoodCategory foodCategory);
	public int edit(FoodCategory foodCategory);
	public List<FoodCategory> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public int delete(Long id);
	public List<FoodCategory> findAll();
}
