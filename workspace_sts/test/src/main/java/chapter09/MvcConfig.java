package chapter09;

import javax.sql.DataSource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"chapter09"}) // 스캔할 베이스 패키지
@MapperScan(basePackages = {"chapter09"}, annotationClass = Mapper.class) // Mapper 인터페이스 스캔
@EnableTransactionManagement
public class MvcConfig implements WebMvcConfigurer{
	// 뷰리졸버 - 포워딩할 경로 앞/뒤 설정
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	// HikariCP
	@Bean
	public DataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
//		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
//		dataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		dataSource.setJdbcUrl("jdbc:log4jdbc:mariadb://localhost:3306/test");
		dataSource.setUsername("testuser");
		dataSource.setPassword("test1234");
		return dataSource;
	}
	// MyBatis
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean ssf = new SqlSessionFactoryBean();
		ssf.setDataSource(dataSource()); // 의존성 주입
		// mapper파일의 위치
//		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//		ssf.setMapperLocations(resolver.getResources("classpath:/mapper/**/*.xml"));
		return ssf.getObject();
	}
	// DAO에서 주입받을 객체
	// sql 실행하려고
//	@Bean
//	public SqlSessionTemplate sst() throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory());
//	}
	
	// 트랜잭션매니저 빈 등록
	@Bean
	public TransactionManager tm() {
		DataSourceTransactionManager dtm = 
				new DataSourceTransactionManager(dataSource());
		return dtm;
	}
	
	// 인터셉터 빈 등록
	@Bean
	public LoginInterceptor interception() {
		return new LoginInterceptor();
	}
	
	// 설정
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interception())
			.addPathPatterns("/student/write.do");
		
			// 관리자페이지
//			.addPathPatterns("/admin/**")
//			.excludePathPatterns("/admin/login.do")
	}
	

	
}