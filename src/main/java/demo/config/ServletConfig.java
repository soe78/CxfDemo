package demo.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean<HttpServlet> servlet() {

        HttpServlet s = new HttpServlet() {
            @Override
            protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
                    throws ServletException, IOException {
                resp.getOutputStream().write("hello".getBytes());
                resp.getOutputStream().flush();
            }
        };

        return new ServletRegistrationBean<>(s, "/hello");

    }

}