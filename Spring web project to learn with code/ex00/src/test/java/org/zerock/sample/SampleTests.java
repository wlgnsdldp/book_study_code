package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) //테스트 코드가 스프링을 실행하는 역할을 할 것 이라는 의미
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //지정된 클래스나 문자열을 이용해서 설정 정보를 읽어와 필요한 객체들을 스프링 빈으로 등록
@Log4j //Lombok을 이용해서 로그를 기록하는 Logger를 변수로 생성(log4j 라이브러리와 설정이 있어야 정상적으로 동작)
public class SampleTests {

	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		
		assertNotNull(restaurant); //restaurant가 null이 아니어야 Test 성공
		
		log.info(restaurant);
		log.info("--------------------");
		log.info(restaurant.getChef());
	}
}
