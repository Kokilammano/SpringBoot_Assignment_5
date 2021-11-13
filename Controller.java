package com.abc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Controller {
	@GetMapping("/get")
	public String getPage() {
		return "Welcome from Get";
	}
	
	@PutMapping("/put")
	public String putPage() {
		return "Welcome from Put";
	}
	
	@PostMapping("/post")
	public String postPage() {
		return "Welcome from Post";
	}
	
	@DeleteMapping("/delete")
	public String deletePage() {
		return "Welcome from Delete";
	}
	
	@PatchMapping("/patch")
	public String patchPage() {
		return "Welcome from Patch";
	}
}
