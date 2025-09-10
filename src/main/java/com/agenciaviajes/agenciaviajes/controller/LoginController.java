package com.agenciaviajes.agenciaviajes.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenciaviajes.agenciaviajes.config.JwtFilter;
import com.agenciaviajes.agenciaviajes.dto.Token;
import com.agenciaviajes.agenciaviajes.model.Usuario;
import com.agenciaviajes.agenciaviajes.service.UsuarioService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="api/login") //http://localhosto:8080/api/login/
    public class LoginController {

		private final UsuarioService service;
		@Autowired
		public LoginController(UsuarioService service) { 
			this.service=service;
		}//LoginController
//-----------------------------------------------LoginUser		
     @PostMapping
     public Token loginUser(@RequestBody Usuario usuario) throws ServletException{//El requestBody me pasa la info en el cuerpo de la solicitud
    	//necesito que desde el service me valides este usuario
    	 if(service.validateUser(usuario)) {
    		 return new Token( generateToken(usuario.getCorreo()) );//si el usuario es valido, regreso un nuevo token
            }//If LoginUser
    	 throw new ServletException ("Nombre de usuario o contraseña incorrectos [" + usuario.getCorreo()+ "]");//si no esta el usuario: mandar una expection
        }//LoginUser
     
     //-----------------------------------Generacion Token
     private String generateToken(String correo) {
    
    	 Calendar calendar = Calendar.getInstance();
    	 calendar.add(Calendar.HOUR, 24); 
    	 return Jwts.builder().setSubject(correo)//
 				.claim("role", "Administrador")
 				.setIssuedAt(new Date())
 				.setExpiration(calendar.getTime()) 
 				.signWith(SignatureAlgorithm.HS256, JwtFilter.secret)
 				.compact();
    	 //lugar para frase secreta.
    	 
    	 
     }//generateToken
}//ClassLoginController
