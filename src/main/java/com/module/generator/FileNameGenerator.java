package com.module.generator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class FileNameGenerator {

	

	public String defaultName() {
		String uuid = UUID.randomUUID().toString();
		SimpleDateFormat ds = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return uuid + "_" + ds.format(new Date());
	}
}
