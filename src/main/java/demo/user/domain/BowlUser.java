package demo.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// 테이블 만들기 사용자와 스코어 두개
@Entity
@Table(name="BowlUser")
@AllArgsConstructor
@NoArgsConstructor
public class BowlUser {
	@Id
	private String userId;
	@Column(nullable = false)
	private String phone;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String passwd;
	@Column(nullable = false)
	private Integer average;
	@Column(nullable = false)
	private Date rcntMatch;
	@Column(nullable = false)
	private Date regDate;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Integer getAverage() {
		return average;
	}
	public void setAverage(Integer average) {
		this.average = average;
	}
	public Date getRcntMatch() {
		return rcntMatch;
	}
	public void setRcntMatch(Date rcntMatch) {
		this.rcntMatch = rcntMatch;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	
	
	
}
