package com.jsh.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity  //User 클래스가 MySQL에 테이블이 생성이 된다.
public class User {
	 @Id  //Primary key
	 @GeneratedValue(strategy = GenerationType.IDENTITY)  // 프로젝트에서 연결된 	DB의 넘버링 전략을 따라간다.
	private int id;// 시퀀스, auto_increment
	@Column(nullable = false, length = 30)
	private String username;
	@Column(nullable = false, length = 100)
	private String password;
	@Column(nullable = false, length = 50)
	private String email;  
	@ColumnDefault("'user'")
	private String role; // Enum을  쓰는게 좋다. 이유는 Enum을 쓰면 어떤 데이터의 도메인을 만들 수 있다.
	@CreationTimestamp //시간이 자동으로 입력
	private Timestamp createData;   // 회원이 가입한 시간
}
