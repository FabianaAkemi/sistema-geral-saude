package com.tcc.config.init;


import com.tcc.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 * Created by akemi on 26/08/17.
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{


        @Override
        protected Class<?>[] getRootConfigClasses() {
                return new Class<?>[0];
        }


        @Override protected Class<?>[] getServletConfigClasses() {
                return new Class<?>[]{ WebConfig.class};
        }


        @Override
        protected String[] getServletMappings() {

                return new String[]{"/"};
        }
}
