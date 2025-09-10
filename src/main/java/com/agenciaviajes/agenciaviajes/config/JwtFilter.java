package com.agenciaviajes.agenciaviajes.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;

public class JwtFilter extends GenericFilterBean{
	public static final String secret= "EquipoUltraAlfaEscudronLobo1!";//esta es nuestra frase secreta, no debe de ser solo una palabra.
	//No poner acentos.
	//vamos a crear un filtro. 

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//que voy a validar? GET /api/productos  no..... POST, DELETE, PUT /api/productos si lo valido.
		//  POST /api/usuario/ no tenemos que validar, 
		//GET, PUT, DELETE /api/usuarios/ Si
		HttpServletRequest httpServletRequest =  (HttpServletRequest) request;
		String authHeader = httpServletRequest.getHeader("Authorization");
		// GET /api/productos/ NO
		// POST, DELETE, PUT /api/productos/ SI
		// POST /api/usuarios/ NO
		// GET,PUT, DELETE /api/usuarios/ SI
		//Con el filtro los que tienen SI, me sale el error de Ivalid token 1.
		String method = httpServletRequest.getMethod();
		String URI = httpServletRequest.getRequestURI();
		if ( 
				(( method.equals("POST")  ) && (! URI.contains("/api/Usuarios/"))) 
				|| (( method.equals("GET")  ) && (! URI.contains("/api/Productos/")))
				|| (method.equals("PUT") )
				|| (method.equals("DELETE") )
				){
					if( (authHeader==null) || (! authHeader.startsWith("Bearer: ")) ) {
						System.out.println("1. Invalid Token");
						throw new ServletException("1. Invalid Token");
					}//if
					String token = authHeader.substring(7);
					try{
						Claims claims = Jwts.parser().setSigningKey(secret)
							.parseClaimsJws(token).getBody();
						claims.forEach(
								(key,value)->System.out.println("Key:[" + key 
										+ "[ Value:["+value+"]") 
								);
					}catch (SignatureException | MalformedJwtException | ExpiredJwtException e) {
						System.out.println("2. Invalid Token");
						throw new ServletException("2. Invalid Token");
					}//catch
				}//if method
		
		chain.doFilter(request, response);
	}//dofilter
}
