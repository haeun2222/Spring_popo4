package com.min.edu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {

	private int seq;
	private String id;
	private String title;
	private String content;
	private int ref;
	private int step;
	private int depth;
	private String regdate;
	private String delflag;

}
