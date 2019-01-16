package demo.bowling.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import demo.user.domain.BowlUser;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bowlscore")
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BowlScore implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	// fetch=FetchType.LAZY를 넣게 되면 @jsonIgnoreProperties를 넣어줘야한다.
	@ManyToOne(targetEntity=BowlUser.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
	@MapsId("userId")
	private BowlUser bowluser;
	
	@Column(name="score")
	private Integer score;
	
	@Column(name="match_date")
	private Date matchDate;
	
	@Column(name="reg_date")
	private Date regDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public BowlUser getBowluser() {
		return bowluser;
	}
	public void setBowluser(BowlUser bowluser) {
		this.bowluser = bowluser;
	}
	



}
