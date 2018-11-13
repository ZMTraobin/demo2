package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSInput;

import com.example.demo.dao.IUserMongoDao;
import com.example.demo.entity.UserEntity;

@RestController
public class UserMongoDBController {
	
	@Autowired
	private IUserMongoDao iUserDao;
	
	@RequestMapping("/mongo")
	public void mongoFind() {
		//UserEntity userEntity = iUserDao.findUserByUserName("冬瓜");
		UserEntity user = new UserEntity();
		user.setAge("18");
		user.setDiscription("测试数据");
		user.setName("李bu");
		//iUserDao.save(user);
		//iUserDao.delete(user);
		List<UserEntity> listUsers = iUserDao.findAll();
		for (UserEntity u : listUsers) {
			System.out.println(u.toString());
		}
		
		System.out.println("冬瓜:"+iUserDao.findFamilyByName("冬瓜").toString());
		//System.out.println(userEntity.getDiscription());
	}
	
	 
	

}
