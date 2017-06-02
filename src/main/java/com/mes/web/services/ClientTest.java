package com.mes.web.services;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
import java.net.HttpURLConnection;  
import java.net.URL;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

public class ClientTest extends HttpServlet{
	 public void doGet(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	        //��������ı��뷽ʽ  
	        request.setCharacterEncoding("utf-8");  
	        //���÷���ʱ�ı��뷽ʽ  
	        response.setContentType("text/html;charset=utf-8");  
	        System.out.println("test1");  
	        //����HTTP���ӵ�URL��ַ�����ǵڶ���Ӧ�õ�URL�������ͬһ��������Ͽ��Խ�192.168.1.134���127.0.0.1����localhost  
	        String http="http://192.168.1.106:9000/mm/ServerTest";  
	        URL url=new URL(http);  
	        //����HttpURLConnection����  
	        HttpURLConnection httpurlconnection=(HttpURLConnection) url.openConnection();  
	        //�������������Ĭ��Ϊfalse�����ǲ��ܴ��ݲ�����  
	        httpurlconnection.setDoOutput(true);  
	        //���÷�������ķ�ʽ��ע�⣺һ��Ҫ��д  
	        httpurlconnection.setRequestMethod("POST");  
	        //�������ӳ�ʱ��ʱ�䡣���������ã��������쳣������£����ܻ���ɳ��������޷���������ִ�У�����һ������һ����ʱʱ�䡣��λΪ����  
	        httpurlconnection.setConnectTimeout(30000);  
	        //�����������  
	        OutputStreamWriter writer=new OutputStreamWriter(httpurlconnection.getOutputStream(), "utf-8");  
	        //���ݵĲ������м�ʹ��&���ŷָ  
	        writer.write("username=123&password=456");  
	        //����ˢ�»���������ΪĬ������д�뵽�ڴ�Ļ������У���һ����������ʱ���Ż�д�룬ʹ��������������������д�룬��Ȼ����͵��ر�����  
	        writer.flush();  
	        //���ڹر���������ر�֮��Ͳ�������������ˣ�����Ҫʹ��flushˢ�»�����  
	        writer.close();  
	        //��÷��ص�������  
	        int responseCode=httpurlconnection.getResponseCode();  
	        //��ʾ����ɹ�  
	        if(responseCode==HttpURLConnection.HTTP_OK){  
	            System.out.println("OK"+responseCode);  
	            //��÷���˵���������õ����ص�����  
	            InputStream urlstream=httpurlconnection.getInputStream();  
	            BufferedReader reader=new BufferedReader(new InputStreamReader(urlstream));  
	            String line;  
	            String tline="";  
	            while((line=reader.readLine())!=null){  
	                tline+=line;  
	            }  
	            //������е�����  
	            System.out.println(tline);  
	        }else{  
	            System.out.println("ERR"+responseCode);  
	        }  
	          
	          
	    }  
	      
	    public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	        this.doGet(request, response);  
	    }  
}
