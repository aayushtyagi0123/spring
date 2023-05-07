package productcrudApp.Controller;

import javax.servlet.http.HttpServletRequest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


import productcrudApp.Dao.ProductDao;
import productcrudApp.Model.Product;

@Controller

public  class ProductController {

	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/")
	public String crud(Model m)
	{
		
	   List<Product> products=this.productDao.getAllProduct();
	   m.addAttribute("product", products);
		return "index";
	}
	
	
	
	@RequestMapping("/addproduct")
	public String addproduct(Model m)
	{
		m.addAttribute("title","add Product");
		return "add_product_form";
	}
	
	@RequestMapping(path="/handle-form",method=RequestMethod.POST)
	public RedirectView formhandler(@ModelAttribute() Product prod,HttpServletRequest request)
	{
	    System.out.println(prod);
	    this.productDao.addProduct(prod);
	    
		RedirectView rv=new RedirectView();
		
		rv.setUrl(request.getContextPath()+"/");
		return rv;
		
	}
	
	@RequestMapping("/delete/{pid}")
	public RedirectView delProduct(@PathVariable int pid,HttpServletRequest request)
	{
		this.productDao.deleteProduct(pid);
        RedirectView rv=new RedirectView();
		
		rv.setUrl(request.getContextPath()+"/");
		return rv;
	}
	
	
	@RequestMapping("/update/{pid}")
	public String updateform(@PathVariable int pid,Model m)
	{   
		Product p=this.productDao.getProduct(pid);
		m.addAttribute("product",p);
		 this.productDao.addProduct(p);    
		 
		return "update_form";
	}
	
}

