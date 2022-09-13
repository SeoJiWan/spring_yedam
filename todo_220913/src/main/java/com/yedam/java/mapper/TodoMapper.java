package com.yedam.java.mapper;

import java.util.List;

import com.yedam.java.domain.Todo;

public interface TodoMapper {
	public List<Todo> selectAll();
	public void insert(Todo todo);
	public void delete(int no);
	public void update(Todo todo);
	public Integer getTodoNo();
}
