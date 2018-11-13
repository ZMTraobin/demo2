package com.example.demo.multidata;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.IUserJpaDao;
import com.example.demo.dao.IUserMongoDao;
import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserJpaEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiDataTest {

	@Autowired
	private IUserJpaDao iUserJpaDao;
	
	@Autowired
	private IUserMongoDao iUserMongoDao;
	
	@Test
	public void findMongo() {
		List<UserEntity> listUsers = iUserMongoDao.findAll();
		for (UserEntity u : listUsers) {
			System.out.println(u.toString());
		}
	}
	@Test
	public void findMysql() {
		List<UserJpaEntity> listUsers = iUserJpaDao.findAll();
		for (UserJpaEntity u : listUsers) {
			System.out.println(u.toString());
		}
	}
	
}
