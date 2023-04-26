package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* demo.ShoppingCart.checkout(..))")
	public void beforeLogger(JoinPoint joinpoint) {
//		System.out.println(joinpoint.getSignature());
		String arg = joinpoint.getArgs()[0].toString();
		System.out.println("Before Logger with Argument: " + arg);
	}
	
	@After("execution(* *.*.checkout(..))")
	public void afterLogger() {
		System.out.println("After Logger");
	}
	
	@Pointcut("execution(* demo.ShoppingCart.quantity(..))")
	public void afterReturningPointCut() { 
		
	}
	
	@AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
	public void afterReturning(Integer retVal) {
		System.out.println("After Returning: " + retVal);
	}

}
