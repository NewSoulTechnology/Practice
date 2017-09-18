package com.self.day_three;

public class Person {
        private String name;
        private int age;
        private Dog dog;
        public Person(String name,int age,Dog dog) {
			// TODO Auto-generated constructor stub
        	this.name=name;
        	this.age=age;
        	this.dog=dog;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
        
        public Dog getDog() {
			return dog;
		}
		public void setDog(Dog dog) {
			this.dog = dog;
		}
		@Override
        public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        	Person person=(Person)obj;
        if(name.equals(person.name)&&age==person.getAge()&&dog.equals(person.getDog()))
        	{
//        	System.out.println("*******************");
//        	System.out.println(name.equals(person.name));
//        	System.out.println(age==person.getAge());
//        	System.out.println(dog.equals(person.getDog()));
//        	System.out.println("*******************");
        	return true;
        	}
        return false;
        }
}
