package com.s13sh.jobportal.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.s13sh.jobportal.dto.ApplicantDetails;
import com.s13sh.jobportal.service.ApplicantService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/applicant")
public class ApplicantController {
	
	@Autowired
	ApplicantService applicantService;

	@GetMapping("/complete-profile")
	public String completeProfile() {
		return "applicant-profile.html";
	}
	@PostMapping("/complete-profile")
	public String completeProfile(ApplicantDetails details,@RequestParam File resume,HttpSession session,ModelMap map) {
		return applicantService.completeProfile(details,resume,session,map);
	}
	
}
