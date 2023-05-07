package productcrudApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	
	private String pname;
	private String description;
	private long price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
	public Product(int pid, String pname, String description, long price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.description = description;
		this.price = price;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", description=" + description + ", price=" + price + "]";
	}
	
	
}
