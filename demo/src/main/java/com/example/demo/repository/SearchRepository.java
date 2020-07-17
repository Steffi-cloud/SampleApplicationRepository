package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Accounts;
@Transactional
public class SearchRepository implements SearchRepoByDateAndId {
@PersistenceContext
private EntityManager em;
	



@Override
	public List<String> getAccountByDateAndId(Accounts s, String date) {
		// TODO Auto-generated method stub
		Query query=em.createQuery("SELECT html_url,watchers_count,language,description,name FROM Accounts where date=:date");
	List<String> detailsList=query.getResultList();
	return detailsList;

}

}
