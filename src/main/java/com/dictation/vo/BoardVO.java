package com.dictation.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {

	private long lecture_no;
	private String board_cd;
	private int no;
	private int seq_no;
	private String auth_nm;
	private String title;
	private String content;
	private int read_cnt;
	private String file_nm;
	private String save_file_nm;
	private String input_id;
	private Date input_date;
	private String update_id;
	private Date update_date;
	
}
