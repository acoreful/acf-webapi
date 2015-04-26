package com.acoreful.webapi.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	private Logger logger=LoggerFactory.getLogger(IndexController.class);
	@RequestMapping("/index")
	public String index(){
		if(logger.isInfoEnabled()){
			logger.info("IndexController-index*****************************************");
		}
		return "index";
	}
}
