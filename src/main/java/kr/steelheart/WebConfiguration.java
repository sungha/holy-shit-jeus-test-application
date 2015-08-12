package kr.steelheart;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
	
	private static final Logger log = LoggerFactory.getLogger(WebConfiguration.class);
	

	@Autowired
	private Environment env;


	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		final String defaultServletName = env.getRequiredProperty("spring.web.default.servlet.name");

		log.debug("Binding Application on Default Servlet: {}", defaultServletName);

		configurer.enable(defaultServletName);
	}


}
