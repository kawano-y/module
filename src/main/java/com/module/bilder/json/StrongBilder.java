package com.module.bilder.json;

import com.module.bilder.json.PersonBilder.IStrongBilder;

class StrongBilder implements IStrongBilder {
	
	private String strong;

	public StrongBilder(String strong) {
		super();
		this.strong = strong;
	}
	@Override
	public String strong() {
		return strong;
	}

}
