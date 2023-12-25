package com.imamsab;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringTemplateEngine {

    @Bean
    public SpringTemplateEngine templateEngine(TemplateResolver templateResolver) {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        return templateEngine;
    }

    private void setTemplateResolver(TemplateResolver templateResolver) {
		// TODO Auto-generated method stub
		
	}

	@Bean
    public TemplateResolver templateResolver() {
        TemplateResolver templateResolver = new TemplateResolver();
        templateResolver.setPrefix("/WEB-INF/templates/"); // Adjust the prefix based on your project structure
        templateResolver.setPrefix(".html");
        templateResolver.setTemplateMode("HTML");
        templateResolver.setCharacterEncoding("UTF-8");
        return templateResolver;
    }
}
