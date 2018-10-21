package com.module.bilder.json;

import com.module.bilder.Person;

public class PersonBilder extends AbstractJsonBuilder<Person> {

	private Person person;
	
	public PersonBilder() {
		super();
		this.person = new Person();
	}

	@Override
	public Person bild() {
		return this.person;
	}

	public PersonBilder person(String name, String jyusyo, Integer age, IStrong strong){
		person.setName(name);
		person.setAge(age);
		person.setStlonger(strong.strong());
		return this;
	}

	interface IStrong {
		String strong();
	}

	public static class Strong implements IStrong {

		private String strong;

		public Strong(String strong) {
			super();
			this.strong = strong;
		}

		public Strong(Integer strong) {
			super();
			this.strong = strong.toString();
		}
		@Override
		public String strong() {
			return strong;
		}
	}
}
