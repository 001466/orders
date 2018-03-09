package com.ec.customer.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.customer.dao.OrdersMapper;
import com.ec.customer.model.Orders;
import com.ec.customer.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersMapper ordersMapper;

	@Override
	public int insert(Orders record) {
		try {
			return ordersMapper.insert(record);
		} catch (Exception e) {
			if (e instanceof java.sql.SQLSyntaxErrorException
					|| e.getCause() instanceof java.sql.SQLSyntaxErrorException) {
				ordersMapper.createTable();
				return ordersMapper.insert(record);
			}
			throw e;
		}
	}



	@Override
	public int insert(Collection<Orders> record) {

		try {
			return ordersMapper.insertByList(record);
		} catch (Exception e) {
			if (e instanceof java.sql.SQLSyntaxErrorException
					|| e.getCause() instanceof java.sql.SQLSyntaxErrorException) {
				ordersMapper.createTable();
				return ordersMapper.insertByList(record);
			}
			throw e;
		}
	
	}

}
