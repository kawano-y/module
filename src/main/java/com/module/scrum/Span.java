package com.module.scrum;

import java.util.Date;

/**
 * 開始と終了日
 * 期間を表す
 * @author yoshinari
 *
 */
public class Span {
	
	private Date startDate;

	private Date endDate;

	public Span(Date startDate, Date endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
}
