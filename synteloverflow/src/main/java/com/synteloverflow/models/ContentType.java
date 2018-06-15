package com.synteloverflow.models;

import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
public abstract class ContentType {
	private String content;
	
	public ContentType() {}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
