package pkg.cm.spkswm;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/* 2020.11.04 : WebSecurity 관련 설정 클래스
 *
  # WebSecurityConfigurerAdapter
  - `WebSecurityConfigurer` 인스턴스 를 만들기위한 편리한 기본 클래스를 제공합니다. 구현은 overriding methods를 허용합니다.
  - `AbstractHttpConfigurer` 의 `SpringFactoriesLoader` 에서 개발자는 기본값을 확장합니다.

 	* To do this, you must create a class that extends AbstractHttpConfigurer and then create a file in the classpath
 		at "META-INF/spring.factories" that looks something like:
 	* 이렇게 하려면 `AbstractHttpConfigurer`를 EXTENDS 하는 클래스를 만든다음, "META-INF/spring.factories"의 클래스 경로에 다음과 같은 파일을 만들어야합니다.
	```
		org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer
		 = sample.MyClassThatExtendsAbstractHttpConfigurer, sample.OtherThatExtendsAbstractHttpConfigurer
	```


	2020.11.09 : WebSecurityConfigurer 클래스를 상속받은 사용자 정의 시큐어 클래스 생성
 *
 */
@Configuration
@EnableWebSecurity
public class MyWebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	/*
	 * @Override public void configure(WebSecurity web) throws Exception {
	 * web.ignoring() // Spring Security should completely ignore URLs starting with
	 * /resources/ .antMatchers("/resources/**"); }
	 *
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().antMatchers("/public/**").permitAll().anyRequest()
	 * .hasRole("USER").and() // Possibly more configuration ... .formLogin() //
	 * enable form based log in // set permitAll for all URLs associated with Form
	 * Login .permitAll(); }
	 *
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { auth // enable in memory based authentication with a user named
	 * "user" and "admin"
	 * .inMemoryAuthentication().withUser("user").password("password").roles("USER")
	 * .and().withUser("admin").password("password").roles("USER", "ADMIN"); }
	 */

    // Possibly more overridden methods ...

	@Override
	  protected void configure(HttpSecurity http) throws Exception {
	    http
	      .authorizeRequests().anyRequest().authenticated()  // 모든 요청에 대한 인증처리
	        .and()
	      .formLogin() // 폼로그인사용
	        .loginPage("/loginSelf") // 사용자가 지정한 uri를 사용하도록 명시
	        .permitAll(); // 접근권한은 모두 (어느 url 로 접근하든 로긴 세션이 없을시 loginSelf 로 이동)
	  }

}