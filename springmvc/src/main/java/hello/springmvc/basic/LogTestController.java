package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j  // log.trace 등 사용가능
@RestController
public class LogTestController {
	// private final Logger log = LoggerFactory.getLogger(LogTestController.class);

	@RequestMapping("/log-test")
	public String logTest() {
		String name = "Spring";

		System.out.println("name = " + name);

		log.trace("trace log={}" + name); // 이렇게 해도 결과가 같지만 이렇게 사용 X ( 연산이 일어나서 낭비 )
		log.trace("trace log={}", name);
		log.debug("debug log={}", name);
		log.info(" info log={}", name);
		log.warn(" warn log={}", name);
		log.error("error log={}", name);

		return "ok";
	}
}
