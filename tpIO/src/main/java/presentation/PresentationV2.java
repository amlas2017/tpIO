package presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresentationV2 {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			       new String[]{"config.xml"}); 
	IMetier metier = (IMetier) context.getBean("metier"); 
	System.out.print(metier.calcul());
	
	}
}
