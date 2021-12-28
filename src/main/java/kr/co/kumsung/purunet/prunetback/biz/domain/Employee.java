package kr.co.kumsung.purunet.prunetback.biz.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "S_EMP")
public class Employee {
	
	@Id    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

}
