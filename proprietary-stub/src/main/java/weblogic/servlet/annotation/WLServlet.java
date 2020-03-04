package weblogic.servlet.annotation;

public @interface WLServlet {
   String name();
   String runAs() default "";
   WLInitParam[] initParams();
   String[] mapping();
}
