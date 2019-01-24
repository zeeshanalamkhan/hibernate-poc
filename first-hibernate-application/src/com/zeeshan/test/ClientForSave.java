package com.zeeshan.test;
import org.hibernate.cfg.*;

import com.zeeshan.hibernate.Product;

import org.hibernate.*;

class ClientForSave 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Product p = new Product();
		p.setProductId(1001);
		p.setProName("Papers");
		p.setPrice(523.36);
		//int id=101;
		try{
			Product p1=session.load(Product.class, p.getProductId());
			p1.setProName("Laser-Gun");
			/*p1.setProductId(1002)*/;// it'll raise the exception
			//here when we call tx.commit(), implicitly update() is called and object is updated
			//session.save(p1);
			System.out.println(p);
			System.out.println(p1);
			/*Product p1 = new Product();
			p1.setProductId(p.getProductId());
			p1.setPrice(100.52);
			p1.setProName("Stationary");
			session.update(p1);*/
		}catch(Exception e){
			e.printStackTrace();
		}
		/*if(id>0){
			System.out.println("Person saved into DATABASE successfully!....");
		}else{
			System.out.println("Person not saved into DATABASE successfully!....");
		}*/
		
		tx.commit();
		session.close();
		sf.close();

	}
}
