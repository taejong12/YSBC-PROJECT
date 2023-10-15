package com.ysbc.front.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
	 
	private int boardSeq;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private Date boardRegDate;
	private Date boardUpdate;
	
}
