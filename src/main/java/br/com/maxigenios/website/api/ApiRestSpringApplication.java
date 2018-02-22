package br.com.maxigenios.website.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.maxigenios.website.api.domain.Usuario;
import br.com.maxigenios.website.api.enums.PerfilEnum;
import br.com.maxigenios.website.api.repository.UsuarioRepository;
import br.com.maxigenios.website.api.util.PasswordUtil;

@SpringBootApplication
@EnableCaching 
public class ApiRestSpringApplication {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
//			String encodedPassword = PasswordUtil.generateBCrypt("123456");
//			System.out.println("Encoded Password:  " + encodedPassword);
//			
//			encodedPassword = PasswordUtil.generateBCrypt("123456");
//			System.out.println("New Encoded Password:  " + encodedPassword);
//			
//			System.out.println("is a valid password ? " + PasswordUtil.isValid("123456", encodedPassword));
			
//			Usuario usuario = new Usuario();
//			usuario.setEmail("usuario@email.com.");
//			usuario.setPerfil(PerfilEnum.ROLE_USER);
//			usuario.setSenha(PasswordUtil.generateBCrypt("123456"));
//			this.usuarioRepository.save(usuario);
//			
//			Usuario admin = new Usuario();
//			admin.setEmail("admin@email.com");
//			admin.setPerfil(PerfilEnum.ROLE_ADMIN);
//			admin.setSenha(PasswordUtil.generateBCrypt("123456"));
//			this.usuarioRepository.save(admin);
			
		};
	}
	
	
	 @Bean
	  public WebMvcConfigurerAdapter adapter() {
	    return new WebMvcConfigurerAdapter() {
	      @Override
	      public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("swagger-ui.html")
	            .addResourceLocations("classpath:/META-INF/resources/");
	        registry.addResourceHandler("/webjars/**")
	            .addResourceLocations("classpath:/META-INF/resources/webjars/");

	        super.addResourceHandlers(registry);
	      }
	    };
	  }
	 
}
