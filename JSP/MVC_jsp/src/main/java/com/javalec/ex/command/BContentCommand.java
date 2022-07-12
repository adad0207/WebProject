package com.javalec.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.dao.BDao;
import com.javalec.ex.dto.BDto;

public class BContentCommand implements Bcommand{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String bId = request.getParameter("bId");	//bId를 가져옴
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);	//DAO의 contentView 실행
		
		request.setAttribute("content_view", dto);	//나온 dto setAttribute
		
	}
}
