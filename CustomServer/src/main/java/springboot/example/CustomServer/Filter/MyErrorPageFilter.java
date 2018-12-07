package springboot.example.CustomServer.Filter;

import org.springframework.boot.web.servlet.support.ErrorPageFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by curry on 18-12-5.
 */
public class MyErrorPageFilter extends ErrorPageFilter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }


}
