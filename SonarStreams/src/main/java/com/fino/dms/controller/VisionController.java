package com.fino.dms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fino.dms.entity.Apps;
import com.fino.dms.entity.Employee;
import com.fino.dms.entity.Mobile;
import com.fino.dms.repo.AppRepo;
import com.fino.dms.repo.EmployeeRepo;
import com.fino.dms.repo.MobileRepo;

@RestController
public class VisionController {

	@Autowired
	EmployeeRepo employeeServiceImpl;

	@Autowired
	AppRepo appRepository;
	
	@Autowired
	MobileRepo mobileRepository;

	@GetMapping(path = "/getApp")
	public List<Apps> getApp() {
		//return employeeServiceImpl.findAll();
		
		return appRepository.findAll();
	}
	
	
	@GetMapping(path = "/getMobile")
	public String  getMobileDetails() {
		//return employeeServiceImpl.findAll();
		List<Mobile> findAll = mobileRepository.findAll();
		findAll.forEach(e -> {
			System.out.println("  "  + e.toString());
		});
		return "Vikas ";
	}

	@GetMapping(path = "/getStatus")
	public String test(@RequestParam String mobileSeries, @RequestParam String mobileCompany) {

//		 Mobile mobile = new Mobile(mobileSeries,mobileCompany);
//	     Mobile save = mobileRepository.save(mobile);
//	     
//	     appRepository.save(new Apps("Whatsapp", 25, mobile));
//		 appRepository.save(new Apps("Be My Eyes", 18, mobile));
//		 appRepository.save(new Apps("Battleground", 250, mobile));
		
		return "Output " + mobileSeries + " _ " + mobileCompany;

	}

}
