package DTO;

public class SmartPhone {
	private String name;//�𵨸�
	private String company;//������
	private int price;//����
	private String provider;//��Ż�
	private int weight;//����
	private String color;//����
	
	public SmartPhone() {
		
	}
	public SmartPhone(String name,String company,int price,String provider,
			int weight,String color) {
		this.name=name;
		this.company=company;
		this.price=price;
		this.provider=provider;
		this.weight=weight;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showSmartphoneInfo() {
		System.out.printf("�𵨸�:%s\n", name);
		System.out.printf("������:%s\n", company);
		System.out.printf("����:%d\n", price);
		System.out.printf("��Ż�:%s\n", provider);
		System.out.printf("����:%d\n", weight);
		System.out.printf("����:%s\n", color);
	}
}
