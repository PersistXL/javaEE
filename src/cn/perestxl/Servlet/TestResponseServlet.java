package cn.perestxl.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by ACER on 2017/10/9.
 */
@WebServlet(name = "TestResponseServlet",urlPatterns = "/TestResponseServlet")
public class TestResponseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getMethod()+"提交方式");
//        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8") ;
       /* String value = request.getQueryString();
        System.out.println(value);*/
        //根据参数名得到参数值
        /*
        String name = request.getParameter("name");
        System.out.println(name);
        */
        String[] habits = request.getParameterValues("habits");
        for (String h:habits){
            System.out.println(h+",");
        }
        Enumeration<String> enumeration =  request.getParameterNames();
        while (enumeration.hasMoreElements()){
            String name = enumeration.nextElement();
            String value = request.getParameter(name);
            System.out.println(name+"="+value);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

}
