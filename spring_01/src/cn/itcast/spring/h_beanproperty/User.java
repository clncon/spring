package cn.itcast.spring.h_beanproperty;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
	
	private Long id;
	private String name="δ��";
	private boolean gender;
	private Set<String> addressSet;//Set����
	private Set numberSet;//Set����(Integer)
	private List<String> addressList;//List����
	private Map<String,String> addressMap;//map����
	private String[] addressArray;//array����
	private Properties props;//Properties����
	
	
	public User(){}
	
	public User(Long id, String name, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	public Set<String> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}

	

	public Set getNumberSet() {
		return numberSet;
	}

	public void setNumberSet(Set numberSet) {
		this.numberSet = numberSet;
	}
     
	
	
	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}
    
	
	
	public String[] getAddressArray() {
		return addressArray;
	}

	public void setAddressArray(String[] addressArray) {
		this.addressArray = addressArray;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[id="+id+",name="+name+",gender="+gender+"]";
	}
	
	
	

}
