package com.cyri.gameservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class GameServiceController {
	 private static final Logger logger = LogManager.getLogger(GameServiceController.class);
	 	
	    @GetMapping("/welcome")
	    public String welcome() {
            logger.debug("Inside welcome method of controller");
	        return "Game Service welcome"; 
	    }
}
