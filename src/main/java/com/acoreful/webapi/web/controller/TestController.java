package com.acoreful.webapi.web.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@RequestMapping
	public void index(HttpServletRequest req,HttpServletResponse resp){
		logger.info("test****************************");
		try {
			resp.sendError(HttpServletResponse.SC_NOT_FOUND,"文件不存在！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
