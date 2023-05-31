package com.luv2code.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.luv2code.aopdemo")
public class DemoConfig {

}


//@Before: Method devreye girmeden önce çalışır.
//@AfterReturning: Method başarılı sonuçlandıktan sonra çalışır.
//@AfterThrowing: Methodun exception dönmesi durumunda çalışır.
//@After: Returning ve Throwing her iki durumdada çalışır. (finally)
//@Around: Method devreye girmeden önce ve metod bittikten sonra çalışır.