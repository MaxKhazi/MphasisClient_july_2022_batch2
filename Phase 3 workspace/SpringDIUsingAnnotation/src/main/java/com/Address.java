package com;

import org.springframework.stereotype.Component;

@Component								//<bean class="com.Address"></bean>
public class Address {					// by default id is class name in camel naming rules 
private String city;					// id ie address
private String state;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
