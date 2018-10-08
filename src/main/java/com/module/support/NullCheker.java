package com.module.support;

public class NullCheker {

	public boolean containNull(Object... os){
		for (Object obj : os) {
			if(obj == null){
				return true;
			}
		}
		return false;
	}
}
