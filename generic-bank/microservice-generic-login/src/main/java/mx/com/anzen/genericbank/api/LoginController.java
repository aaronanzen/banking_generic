package mx.com.anzen.genericbank.api;

import mx.com.anzen.genericbank.services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class LoginController {
	
 @Autowired
 private LoginServices loginServices;
	
 
 @RequestMapping("/login")
 @ResponseBody
 String home() {
 return "LoginAplication";
 }
 
}