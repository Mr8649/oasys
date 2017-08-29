package cn.gson.oasys.model.entity.note;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 此处有一个parentid需要连接
 * @author admin
 * ---目录表----
 *
 */
@Entity
@Table(name="aoa_catalog")
public class Catalog {

	@Id
	@Column(name="catalog_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long catalogId; //目录id
	
	@Column(name="catalog_name")
	private String catalogName; //目录名字
	
	//判断id
	@Column(name="parent_id")
	private Integer parentId;

//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="catalog_id")
//	private Note note;
//	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="catalog_id")
//	private Director director;
	
	@Override
	public String toString() {
		return "Catalog [catalogName=" + catalogName + "]";
	}

	public Long getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public Catalog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Catalog(String catalogName) {
		super();
		this.catalogName = catalogName;
	} 
	
	
	
}
