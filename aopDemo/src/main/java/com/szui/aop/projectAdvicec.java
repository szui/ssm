package com.szui.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @Author:szui
 * @Date:2023/9/16 14:47
 * @Description:
 */
@Component
@Aspect
public class projectAdvicec {

    @Pointcut("execution( * com.szui.service.*.update(..))")
    private void SetvicePt(){}


    //@Before("SetvicePt()")
    public void runSpeddBefore(){
        System.out.println("Before ---  AOP方法");
    }

    //@After("SetvicePt()")
    public void runSpeddAfter(){
        System.out.println("After ---  AOP方法");
    }

    //@Around("SetvicePt()")
    public Object runSpeddAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Around ---  AOP方法");

        Object ret = joinPoint.proceed();
        System.out.println("结束环绕");
        return ret;
    }

    //@Around("SetvicePt()")
    public void UserRunAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around ---  AOP方法");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            joinPoint.proceed();
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("结束环绕"+(end-start));
    }

    //@Before("SetvicePt()")
    public void before(JoinPoint joinPoint){

        System.out.println(joinPoint.getArgs());
        Object o = joinPoint.getArgs();

    }

    @Around("SetvicePt()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        Object object = null;

        Object[] o = joinPoint.getArgs();
        System.out.println("参数"+ Arrays.toString(o));
        try {
            object = joinPoint.proceed();
        }catch (Throwable e){
            /*注释掉这一行就不会输出错误了*/
            e.printStackTrace();
        }

        return object;
    }

    //@AfterReturning(value = "SetvicePt()",returning = "ret")
    public void AfterReturning(String ret){
        System.out.println("返回值"+ret);
    }

    //@AfterThrowing(value = "SetvicePt()",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("返回值"+e);
    }

}
