package com.ucsal.arqsoftware.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_approval_histories")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ApprovalHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Setter
	private Long id;
	
	@Setter
	private Date dateTime;
	
	@Setter
	private boolean decision;
	
	@Setter
	private String observation;
	
	@Setter
	private Long userId;
	
	@Setter
	private Long requestId;
	
	public ApprovalHistory() {
	}

}
