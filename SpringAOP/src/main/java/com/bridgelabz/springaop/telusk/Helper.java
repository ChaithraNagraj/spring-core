package com.bridgelabz.springaop.telusk;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * purpose: program is written for helping other classes which can required
 *  logging,security and transaction related  service
 *  @Aspect will help to create Aspect class
 * @author admin
 *
 */

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
@Before("execution(public void show())")
public void log() {
	System.out.println("logging the meessage");
}
}
