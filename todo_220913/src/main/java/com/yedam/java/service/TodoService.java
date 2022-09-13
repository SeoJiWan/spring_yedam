package com.yedam.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.domain.Todo;
import com.yedam.java.mapper.TodoMapper;

@Service
public class TodoService {
	
	@Autowired TodoMapper mapper;
	
	public List<Todo> selectAll() {
		return mapper.selectAll();
	}
	
	public Integer getTodoNo() {
		return mapper.getTodoNo();
	}
	
	public void insertItem(Todo todo) {
		mapper.insert(todo);
	}
	
	public void deleteItem(int no) {
		mapper.delete(no);
	}
	
	public void updateItem(Todo todo) {
		mapper.update(todo);
	}
}
