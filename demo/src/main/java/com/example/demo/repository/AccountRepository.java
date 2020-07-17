package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Integer>,SearchRepoByDateAndId {

}
