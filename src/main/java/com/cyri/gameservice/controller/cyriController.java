package com.cyri.gameservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class cyriController {
	 private static final Logger logger = LogManager.getLogger(cyriController.class);

	    @GetMapping("/welcome")
	    public String welcome() {
            logger.debug("Inside welcome method of controller");
	        return "welcome"; 
	    }
}
