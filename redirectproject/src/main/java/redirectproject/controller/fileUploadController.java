package redirectproject.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
public class fileUploadController {

	@RequestMapping("/fileupload")
	public String showpage()
	{
		return "fileupload";
	}
	
	
	@RequestMapping(path="/upload",method=RequestMethod.POST)
	public String uploading(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m )
	{
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getBytes());
		    byte[] bytes=file.getBytes();
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		 try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(bytes);
			fos.close();
			System.out.print("file Uploaded");
			m.addAttribute("msg","file uploaded!");
			m.addAttribute("file",file.getOriginalFilename());
		} catch (IOException io)
		 {
			// TODO Auto-generated catch block
			io.printStackTrace();
			m.addAttribute("msg","file not uploaded");
			
		}
		 
		 return "uploadedsuccess";
		 
	}
	
	
}
