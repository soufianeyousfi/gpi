package org.gpi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "document")
public class Document {

	@Id
	@GeneratedValue
	@Column(name = "documentID")
	private Long documentID;

	@Column(name = "name")
	private String name;

	@Column(name = "url")
	private String url;


	public Long getDocumentID() {
		return documentID;
	}

	public void setDocumentID(Long documentID) {
		this.documentID = documentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	@Override
	public String toString() {
		return "Document [documentID=" + documentID + ", name=" + name
				+ ", url=" + url + "]";
	}

	
	
}
