package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dynamics;

@RestController
@RequestMapping("/music")
public class DynamicsController {
	@Autowired
	Dynamics dynamics;
	@RequestMapping("/dynamics")
		public int dynamics (Dynamics dynamics) {
		return 0;
	}
}
