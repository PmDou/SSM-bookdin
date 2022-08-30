package com.java.programmer.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.programmer.entity.Account;
/**
 * 客户信息dao
 * 
 *
 */
@Repository
public interface AccountDao {
	public int add(Account account);
	public int edit(Account account);
	public List<Account> findList(Map<String, Object> queryMap);
	public Integer getTotal(Map<String, Object> queryMap);
	public int delete(Long id);
	public Account findByName(String name);
}
