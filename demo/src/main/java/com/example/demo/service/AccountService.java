package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Accounts;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {
@Autowired
private  AccountService repo;

public List<String> getRepoByDateAndId(Accounts s, String date) throws ParseException{
	List<String> fetchedData=repo.getRepoByDateAndId(s, date);
	
	List<String> listString=new ArrayList<String>();
	
	
	SimpleDateFormat df=new SimpleDateFormat();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			LocalDate dateLocal=LocalDate.now();
			LocalDate localDate = LocalDate.parse(date, formatter);
		
	List<LocalDate> listDates=	getDatesBetweenUsingJava8(dateLocal,localDate);
	if(listDates.size()<7) {
		for(int i=0;i<listDates.size();i++) {
			listString.add(s.getHtml_url());
			listString.add(s.getDescription());
			listString.add(s.getWatchers_count());
			listString.add(s.getLanguage());
			listString.add(s.getName());
	
			return listString;
		}
	}
	else {
		throw new RuntimeException("records not found");
	}
//	return repo.getRepoByDateAndId();
	return listString;
}
public static List<LocalDate> getDatesBetweenUsingJava8(
		  LocalDate startDate, LocalDate endDate) { 
		 
		    long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate); 
		    return IntStream.iterate(0, i -> i + 1)
		      .limit(numOfDaysBetween)
		      .mapToObj(i -> startDate.plusDays(i))
		      .collect(Collectors.toList()); 
		}

}
