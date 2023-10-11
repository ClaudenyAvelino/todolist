package br.com.claudeny.todolist.filter;

import java.io.IOException;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Component
public class FilterTaskAuth implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
     
                System.out.println("chegou no filtro");
                chain.doFilter(request, response);
    }
    
}