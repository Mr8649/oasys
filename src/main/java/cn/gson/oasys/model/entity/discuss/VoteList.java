package cn.gson.oasys.model.entity.discuss;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="aoa_voteList")
public class VoteList{
	
	@Id
	@Column(name="vote_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long voteId;				//主键id
	
	@Column(name="start_time")			//投票开始时间
	private Date startTime;
	
	@Column(name="end_time")			//投票结束时间
	private Date endTime;
	
	@OneToOne(mappedBy = "voteList")
	private Discuss discuss;
	

	public Long getVoteId() {
		return voteId;
	}

	public void setVoteId(Long voteId) {
		this.voteId = voteId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public VoteList() {
		super();
	}
	
	
	
}
