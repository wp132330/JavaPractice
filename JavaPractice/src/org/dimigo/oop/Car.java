package org.dimigo.oop;

public class Car {
		private String company;
		private String model;
		private String color;
		private int maxSpeed;
		private int price;
		
		public String getcompany(){
			return company;
		}
		
		public String getmodel(){
			return model;
		}
		
		public String getcolor(){
			return color;
		}
		
		public int maxSpeed(){
			return maxSpeed;
		}
		
		public int price(){
			return price;
		}

		public void setcompany(String company) {
			this.company = company;
		}

		public void setmodel(String model) {
			this.model = model;
		}

		public void setcolor(String color) {
			this.color = color;
		}
		
		public void setmaxSpeed(int maxSpeed){
			this.maxSpeed = maxSpeed;
		}
		
		public void setprice(int price){
			this.price=price;
}
}

