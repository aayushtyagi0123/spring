package productcrudApp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudApp.Model.Product;

@Component
public class ProductDao {
	
@Autowired
 private HibernateTemplate hibernateTemplate;
	
	//insert product
   @Transactional
	public void addProduct(Product p)
	{
		 this.hibernateTemplate.saveOrUpdate(p);
		
	}
	
	//get single product
	public Product getProduct(int pid)
	{
		Product p=this.hibernateTemplate.get(Product.class, pid);
		return p;
	}
	
	//get all product
	public List<Product> getAllProduct()
	{
		List<Product> products=this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//delete
	@Transactional
	public void deleteProduct(int pid)
	{
		  Product p=  this.hibernateTemplate.get(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}

}