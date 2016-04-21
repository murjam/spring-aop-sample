package hello.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UninvitedGuestAspect {
	
	@Around("execution(String hello.service.*.get*())")
	public String addSomeone(ProceedingJoinPoint jp) throws Throwable {
		return "Magic happened";
	}
	
}
