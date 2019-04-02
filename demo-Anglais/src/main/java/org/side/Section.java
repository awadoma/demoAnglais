package org.side;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
 
public class Section {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String userEntry;
	private String explanation;
	
	public  Section() {
		
	}
	public Long getIdSection() {
		return id;
	}
	public void setIdSection(Long idSection) {
		this.id = idSection;
	}
	public String getUserEntry() {
		return userEntry;
	}
	public void setUserEntry(String userEntry) {
		this.userEntry = userEntry;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public Section(Long id, String userEntry, String explanation) {
		super();
		this.id = id;
		this.userEntry = userEntry;
		this.explanation = explanation;
	}
	public Section(String userEntry, String explanation) {
		
		this.userEntry = userEntry;
		this.explanation = explanation;
	}
	@Override
	public String toString() {
		return "Section [id=" + id + ", userEntry=" + userEntry + ", explanation=" + explanation + "]";
	}
	
}
