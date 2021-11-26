package com.epam.taxvicespring.utils;

import java.util.Collection;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServletRequest;

public class UrlPatternUtils {

    private UrlPatternUtils(){}

    private static boolean hasUrlPattern(ServletContext servletContext,
            String urlPattern) {

        Map<String, ? extends ServletRegistration> map =
            servletContext.getServletRegistrations();

        for ( Map.Entry<String, ? extends ServletRegistration> sr : map.entrySet()){
            Collection<String> mappings = sr.getValue().getMappings();
            if (mappings.contains(urlPattern)) {
                return true;
            }
        }
        return false;
    }

    // servletPath:
    // ==> /spath
    // ==> /spath/*
    // ==> *.ext
    // ==> /
    public static String getUrlPattern(HttpServletRequest request) {
        ServletContext servletContext = request.getServletContext();
        String servletPath = request.getServletPath();
        String pathInfo = request.getPathInfo();
        return servletPath;

        // String urlPattern = null;
        // if (pathInfo != null) {
        //     urlPattern = servletPath + "/*";
        //     return urlPattern;
        // }

        // urlPattern = servletPath;

        // boolean has = hasUrlPattern(servletContext, urlPattern);
        // if (has) {
        //     return urlPattern;
        // }

        // int i = servletPath.lastIndexOf('.');
        // if (i != -1) {
        //     String ext = servletPath.substring(i + 1);
        //     urlPattern = "*." + ext;
        //     has = hasUrlPattern(servletContext, urlPattern);

        //     if (has) {
        //         return urlPattern;
        //     }
        // }
        // return "/";
    }
}