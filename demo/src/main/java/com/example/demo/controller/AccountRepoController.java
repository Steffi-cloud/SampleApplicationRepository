package com.example.demo.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Accounts;
import com.example.demo.service.AccountService;

@RestController
public class AccountRepoController {
	
	@Autowired
	private AccountService accountService;
	@RequestMapping(value="/getRepositories",method=RequestMethod.GET)
	
	public List<String> getRepositoriesByDate(@RequestBody Accounts  s,@RequestParam String date) throws ParseException{
		return accountService.getRepoByDateAndId(s,date);
		
	}

}
