package com.javalec.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.dao.BDao;
import com.javalec.ex.dto.BDto;

public class BContentCommand implements Bcommand{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String bId = request.getParameter("bId");	//bId�� ������
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);	//DAO�� contentView ����
		
		request.setAttribute("content_view", dto);	//���� dto setAttribute
		
	}
}
