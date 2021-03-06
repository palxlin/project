package com.xplore.web.domain;

import com.xplore.web.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "tbl_plate_en")
public class PlateEnglish {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name="plate_id")
    private Integer plateId;

	@Column(name="title")
	private String title;
	
	@Column(name="brief")
	private String brief;

	@Column(name="content")
	private String content;
	
	@Column(name="weight")
	private Integer weight;
	
	@Column(name="create_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Integer getPlateId() {
		return plateId;
	}

	public void setPlateId(Integer plateId) {
		this.plateId = plateId;
	}

}
