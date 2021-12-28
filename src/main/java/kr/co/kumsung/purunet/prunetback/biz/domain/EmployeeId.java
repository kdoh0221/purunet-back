package kr.co.kumsung.purunet.prunetback.biz.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeId implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String mailId;
}
