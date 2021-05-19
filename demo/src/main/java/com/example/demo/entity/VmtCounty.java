package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vmt_county")
public class VmtCounty {
	
    @Id
    @Column(name = "county_fips")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer countyFips;
    
    @Column(name = "county_name")
    private String countyName;
    
    @Column(name = "state_name")
    private String stateName;
    
    @Column(name = "date")
    private LocalDate date;
    
    @Column(name = "county_vmt")
    private Integer countyVmt;
    
    @Column(name = "baseline_jan_vmt")
    
    private Integer baselinejanVmt;
    
    @Column(name = "percent_change_from_jan")
    private BigDecimal percent_change_from_jan;
    
    @Column(name = "date_at_low")
    private LocalDate dateAtLow;
    
    @Column(name = "mean7_county_vmt_at_low")
    private BigDecimal mean7CountyVmtAtLow;
    
    @Column(name = "percent_change_from_low")
    private BigDecimal percentChangeFromLow;

	public Integer getCountyFips() {
		return countyFips;
	}

	public void setCountyFips(Integer countyFips) {
		this.countyFips = countyFips;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getCountyVmt() {
		return countyVmt;
	}

	public void setCountyVmt(Integer countyVmt) {
		this.countyVmt = countyVmt;
	}

	public Integer getBaselinejanVmt() {
		return baselinejanVmt;
	}

	public void setBaselinejanVmt(Integer baselinejanVmt) {
		this.baselinejanVmt = baselinejanVmt;
	}

	public BigDecimal getPercent_change_from_jan() {
		return percent_change_from_jan;
	}

	public void setPercent_change_from_jan(BigDecimal percent_change_from_jan) {
		this.percent_change_from_jan = percent_change_from_jan;
	}

	public LocalDate getDateAtLow() {
		return dateAtLow;
	}

	public void setDateAtLow(LocalDate dateAtLow) {
		this.dateAtLow = dateAtLow;
	}

	public BigDecimal getMean7CountyVmtAtLow() {
		return mean7CountyVmtAtLow;
	}

	public void setMean7CountyVmtAtLow(BigDecimal mean7CountyVmtAtLow) {
		this.mean7CountyVmtAtLow = mean7CountyVmtAtLow;
	}

	public BigDecimal getPercentChangeFromLow() {
		return percentChangeFromLow;
	}

	public void setPercentChangeFromLow(BigDecimal percentChangeFromLow) {
		this.percentChangeFromLow = percentChangeFromLow;
	}

}
