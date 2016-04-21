package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.service.SomeService;

@Controller
public class ProductController {
	
	@Autowired
	private SomeService service;
	
    @RequestMapping("/greeting")
    public void greeting(
    		@RequestParam(value="name", required=false, defaultValue="World") String name,
    		Model model) {
    	
    	Product product = new Product();
    	product.setId(12);
    	product.setTitle("some product");
    	
        model.addAttribute("name", service.getAValue());
        model.addAttribute("product", product);
    }
    
    @RequestMapping("/my")
    @ResponseBody
    public Product myAction(Model model) {
    	Product product = new Product();
    	product.setId(12);
    	product.setTitle("some product");
		return product;
    }

}
