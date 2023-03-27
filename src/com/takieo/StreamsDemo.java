package com.takieo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class productt
{
	private int id;
	private String name;
	private double price;
	public productt(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
public class StreamsDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<productt>productList=new ArrayList<productt>();
		
	productList.add(new productt(1,"HP",25000));
	productList.add(new productt(2,"Lenovo",25000));
	productList.add(new productt(3,"Accer",25000));
	productList.add(new productt(4,"Sony",25000));
	productList.add(new productt(5,"Apple",25000));
	
	productList.stream().forEach(product->System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getPrice()));
	
	
	
/*	

 List<Double>priceList1=productList.stream()
 .filter(p->p.getPrice()<55000)
 .map(p->p.getPrice())
 .collect(Collectors.toList());//this method converts to array format
 System.out.println("priceList");
 

productList.stream().filter(product->product.getPrice()<55000)
.forEach(product->System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getPrice()));
*/
	
	}
}

