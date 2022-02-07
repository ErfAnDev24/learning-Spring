package com.ErfAn;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelloWorld {

	private List<String> addressList;
	
	private Map<Integer, String> addressMap;
	
	private Set<String> addressSet;
	
	private Properties addressProps;

	public void getAddressList() {
		System.out.println("List : "+addressList);
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public void getAddressMap() {
		System.out.println("Map : "+addressMap);	
	}

	public void setAddressMap(Map<Integer, String> addressMap) {
		this.addressMap = addressMap;
	}

	public void getAddressSet() {
		System.out.println("Set : "+addressSet);
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}

	public void getAddressProps() {
		System.out.println("Porps : "+addressProps);
	}

	public void setAddressProps(Properties addressProps) {
		this.addressProps = addressProps;
	}
	
	
}
