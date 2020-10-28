package org.cap.app.customerms.ui;

import org.cap.app.customerms.JavaConfiguration;
import org.cap.app.customerms.exceptions.CustomerIdException;
import org.cap.app.customerms.exceptions.CustomerNameException;
import org.cap.app.customerms.exceptions.CustomerNotExistException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectMainUi {
    public static void main(String[] args) {

             try {

                 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
                 context.register(JavaConfiguration.class);
                 context.refresh();
                 ProjectUI projectUi = context.getBean(ProjectUI.class);
                 projectUi.runui();
                 context.close();
             }
             catch(CustomerIdException e){
                 System.out.println(e.getMessage());
             }
             catch(CustomerNotExistException e){
                 System.out.println(e.getMessage());
             }
             catch(CustomerNameException e){
                 System.out.println(e.getMessage());
             }
             catch(Exception e){
                 e.printStackTrace();
             }

    }


}
