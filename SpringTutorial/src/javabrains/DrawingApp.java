package javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{

    public static void main(String[] args)
    {
        //Triangle tr1 = new Triangle();
        //tr1.draw();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext( "spring.xml" );
//        Triangle triangle = (Triangle) context.getBean( "triangle" );
        Triangle triangle = context.getBean( "triangle-alias", Triangle.class );
        triangle.draw();
    }

}
