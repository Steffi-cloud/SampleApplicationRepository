package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Accounts;

public interface SearchRepoByDateAndId {
public List<String> getAccountByDateAndId(Accounts s,String date);
}
