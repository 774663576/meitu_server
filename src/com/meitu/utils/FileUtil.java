package com.meitu.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 文件
 * @author 间周
 * @creation 2013-7-18 下午1:46:21
 */
public class FileUtil {
	 /** 
     * 写文件到saveLocation (upload/logo.png) 
     * @param in 
     * @param fileNameAndLocation 
     * @throws IOException 
     */  
    public static void copyFile(InputStream in,String fileNameAndLocation) throws IOException{
        FileOutputStream fs = new FileOutputStream(fileNameAndLocation);
          byte[] buffer = new byte[1024 * 1024];
          int bytesum = 0;
          int byteread = 0;
          while ((byteread = in.read(buffer)) != -1) {
              bytesum += byteread;
              fs.write(buffer, 0, byteread);
              fs.flush();  
          }  
          fs.close();  
          in.close();  
    }  
     
    /** 
     * 复制单个文件   copyFile("f:\\1.png","g:\\1.png")
     * @param oldPath String 原文件路�?如：c:/fqf.txt 
     * @param newPath String 复制后路�?如：f:/fqf.txt 
     * @return boolean 
     */ 
   public static void copyFile(String oldPath, String newPath) {
	   File oldFile=new File(oldPath);
	   File newFile=new File(newPath);
	   if(oldFile.exists())
		   copyImage(oldFile,newFile);
   } 
   
   /**
    * 复制文件 
    * @param source
    * @param destination
    */
   public static void copyImage(File source, File destination ){
       FileInputStream fi = null;  
     try {  
         fi = new FileInputStream(source);  
     } catch (FileNotFoundException e) {  
         e.printStackTrace();  
     }  
       BufferedInputStream in=new BufferedInputStream(fi);  
       FileOutputStream fo = null;  
     try {  
         fo = new FileOutputStream(destination);  
     } catch (FileNotFoundException e) {  
         e.printStackTrace();  
     }  
       BufferedOutputStream out=new BufferedOutputStream(fo);  
         
       byte[] buf=new byte[1024];  
       int len;  
     try {  
         len = in.read(buf);  
           while(len!=-1){  
                out.write(buf, 0, len);  
                len=in.read(buf);  
               }  
           out.close();  
           fo.close();  
           in.close();  
           fi.close();  
     } catch (IOException e) {  
         e.printStackTrace();  
     }  
 }  
   
   /**
    * 删除文件  
    * @param path f:\\1.png
    * @return
    */
   public static boolean deleteFile(String path){
	   if(path==null||path.equals(""))
		   return false;
	   try{
		   File file = new File(path); 
		   if(file.exists()){
		      return file.delete();
		   }
		   file=null;
		   return false;		   
		   }catch(Exception e){
		   e.printStackTrace();
		   return false;
	   }
   }
  
   /**
    * 创建目录
    * @param folder
    * @return
    */
   public static boolean createFolder(String folder){
	   File file = new File(folder); 
	  return file.mkdirs();
   }
}
