package com.tfc.ordermanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "DATE_TABLE")
public class Date {
   @Id
   private Integer dateID;
   private LocalDate date;
   private Integer yearNumber;
   private String quarter;
   private Integer monthNumber;
   private String monthName;
   private Integer weekNumber;
   private String weekDay;
   private Integer dayOfMonth;


}