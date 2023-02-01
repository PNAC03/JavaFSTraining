/**
 * 
 */
package com.lpu.test;

import static org.junit.jupiter.api.Assertions.*;
import com.lpu.dao.*;
import org.junit.jupiter.api.Test;

/**
 * @author pnadi
 *
 */
class jdbcwithmysqltest {

	@Test
	void testCreateStatement() {
		System.out.println("I am testing");
	}
	
	@Test
	void testPreparedStatement() {
		System.out.println("I am testing");
		jdbcwithmysql obj = new jdbcwithmysql();
		obj.insertWithParams(9,"NewWorld9");
	}
	
	@Test
	void testInsertStatement() {
		jdbcwithmysql obj = new jdbcwithmysql();
		obj.insert();
	}
}
