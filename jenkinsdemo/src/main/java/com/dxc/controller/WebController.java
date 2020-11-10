/**
 * 
 */
package com.dxc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lpasupuleti
 *
 */
@RestController
public class WebController {
	@GetMapping("/hello")
	public String sayHello() {
		return "HEllo";
	}
	@GetMapping("/hi")
	public String sayHi(){
		return "hi";
	}

}
