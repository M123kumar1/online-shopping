package com.mk.onlineshopping.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtility {
	private static final String ABS_PATH="D:\\OnlineShoppingProj\\online-shopping\\OnlineShopping\\src\\main\\webapp\\assets\\images\\";
	private static String real_path="";
	private static final Logger logger=LoggerFactory.getLogger(FileUploadUtility.class);
	public static void uploadFile(HttpServletRequest request, MultipartFile file, String code) {
		//get the real path
		real_path=request.getSession().getServletContext().getRealPath("/assets/images/");
		
		logger.info(real_path);
		
		//to make sure all the directory exist
		//please create the directories
		if(!new File(ABS_PATH).exists()){
			//create the directories
			new File(ABS_PATH).mkdirs();
		}
		if(!new File(ABS_PATH).exists()){
			//create the directories
			new File(real_path).mkdirs();
		}
		
		try{
			//server upload
			file.transferTo(new File(real_path+code+".jpg"));
			//project directory upload
			file.transferTo(new File(ABS_PATH+code+".jpg"));
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
}
