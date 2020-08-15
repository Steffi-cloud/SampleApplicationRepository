package com.example.demo.model;

import java.util.List;

public class Accounts {
private String name;
private int accountId;
private String email;
private String accountCreationDate;
private String html_url;
private String watchers_count;
private String language;
private String description;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAccountCreationDate() {
	return accountCreationDate;
}
public void setAccountCreationDate(String accountCreationDate) {
	this.accountCreationDate = accountCreationDate;
}

public String getHtml_url() {
	return html_url;
}
public void setHtml_url(String html_url) {
	this.html_url = html_url;
}
public String getWatchers_count() {
	return watchers_count;
}
public void setWatchers_count(String watchers_count) {
	this.watchers_count = watchers_count;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
