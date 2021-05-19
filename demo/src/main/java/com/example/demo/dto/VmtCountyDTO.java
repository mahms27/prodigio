package com.example.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class VmtCountyDTO extends Response{
	
	@JsonProperty("countyFips")
	@NotNull(message = "el campo countyName es obligatorio")
    private Integer countyFips;

	@JsonProperty("countyName")
    @NotNull(message = "el campo countyName es obligatorio")
    private String countyName;

	@JsonProperty("stateName")
    @NotNull(message = "el campo stateName es obligatorio")
    private String stateName;

	@JsonProperty("date")
    @NotNull(message = "el campo date es obligatorio")
    private LocalDate date;

	@JsonProperty("countyVmt")
    @NotNull(message = "el campo countyVmt es obligatorio")
    private Integer countyVmt;

	@JsonProperty("baselinejanVmt")
    @NotNull(message = "el campo baselinejanVmt es obligatorio")
    private Integer baselinejanVmt;

	@JsonProperty("percent_change_from_jan")
    private BigDecimal percent_change_from_jan;

	@JsonProperty("dateAtLow")
    private LocalDate dateAtLow;

	@JsonProperty("mean7CountyVmtAtLow")
    private BigDecimal mean7CountyVmtAtLow;

	@JsonProperty("percentChangeFromLow")
    private BigDecimal percentChangeFromLow;

}
