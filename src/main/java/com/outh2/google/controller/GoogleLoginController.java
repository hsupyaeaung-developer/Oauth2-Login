package com.outh2.google.controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleLoginController {
	
	 @GetMapping( value = "/" )
	    public Object getToken( OAuth2AuthenticationToken token ){
	        return token;
	    }
	
	@GetMapping("/print")
	public Map<String,Object> welcome(@AuthenticationPrincipal OAuth2User oauth2User){
		return oauth2User.getAttributes();
	}
	
	@GetMapping("/welcome")
	public String welcome(){
		return "welcome";
	}
}
