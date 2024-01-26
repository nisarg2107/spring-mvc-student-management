package com.stpl.test;

import org.jboss.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.stpl.service.IStudentService;
import com.stpl.staticdata.TestStaticData;
import com.stpl.testconfig.TestBeanConfig;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestBeanConfig.class,com.stpl.config.AppInitializer.class})
public class IStudentDAOTest {

	private static final Logger logger = Logger.getLogger(IStudentDAOTest.class);  
	
//	@Autowired private IStudentDAO iStudentDAO;
	
	@Autowired private IStudentService iStudentService;
	

	@Transactional
	@Test
	public void testInsert() {
		logger.info(":::::Insert Started:::::");
		System.out.println(iStudentService);
		this.iStudentService.insert(TestStaticData.getData());
		
//		this.iStudentDAO.insert(TestStaticData.getData());
		logger.info(":::::Insert Finished:::::");
	}

	
	@Test
	public void testSearch() {
		logger.info(":::::Search Started:::::");
		System.out.println(iStudentService);
		this.iStudentService.search();
		
//		this.iStudentDAO.insert(TestStaticData.getData());
		logger.info(":::::Search Finished:::::");
	}

	
	@Test
	public void testSearchByName() {
		logger.info(":::::SearchByName Started:::::");
		System.out.println(iStudentService);
		this.iStudentService.searchByName("n");
		
//		this.iStudentDAO.insert(TestStaticData.getData());
		logger.info(":::::SearchByName Finished:::::");
	}

	@Test
	public void testFindById() {
		logger.info(":::::FindById Started:::::");
		System.out.println(iStudentService);
		this.iStudentService.findById(3);
		
//		this.iStudentDAO.insert(TestStaticData.getData());
		logger.info(":::::FindById Finished:::::");
	}

	
	@Test
	public void testDelete() {
		logger.info(":::::Delete Started:::::");
		System.out.println(iStudentService);
		this.iStudentService.delete(TestStaticData.getData());
		
//		this.iStudentDAO.insert(TestStaticData.getData());
		logger.info(":::::Delete Finished:::::");
	}

}
