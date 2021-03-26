package pl.pjatk.pawdon;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Class1 {

    public Class1(ApplicationContext applicationContext){
        System.out.println("Piersza klasa");
        Class2 class2 = applicationContext.getBean("Class2",Class2.class);
    }
    public void helloFromMetrhod1(){
        System.out.println("helloFromMetrhod1");
    }
}
