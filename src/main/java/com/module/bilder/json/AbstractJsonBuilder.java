package com.module.bilder.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.module.bilder.Builder;

public abstract class AbstractJsonBuilder<T> implements Builder<T> {

	protected ObjectMapper mapper;
	
	public AbstractJsonBuilder() {
		this.mapper = new ObjectMapper();
	}

}
