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

	public PersonBilder person(String name, String jyusyo, Integer age, IStrongBilder strongBuilder){
		person.setName(name);
		person.setAge(age);
		person.setStlonger(strongBuilder.strong());
		return this;
	}

	interface IStrongBilder {
		String strong();
	}

	public class StrongBilder implements IStrongBilder {

		@Override
		public String strong() {
			return "めっちゃ強い";
		}
	}
}
