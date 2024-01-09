package com.reno.property.brothers.application.domain.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class District {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		private String district;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}
		
		

     }
