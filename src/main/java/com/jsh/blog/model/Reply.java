package com.jsh.blog.model;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Reply {
	@Id  //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // 시퀀스, auto.increment
	
	@Column(nullable = false, length=200)
	private String content;
	
	@ManyToOne
	@JoinColumn(name ="boardId")
	private Board board;
	
}
