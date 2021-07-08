package com.hr.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //标注一个切面类
@Component//把一个bean注入到spring容器
public class MyLog {

    @Before("execution(* com.hr.service.*.*(..))")//在目标方法执行前切入
    public void before(JoinPoint joinPoint){//JoinPoint--连接点
        System.out.println("开始执行"+joinPoint.getTarget()+"的"+joinPoint.getSignature().getName()+"方法");

    }

}
