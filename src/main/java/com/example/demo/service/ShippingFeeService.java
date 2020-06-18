package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.ShippingFee;
import com.example.demo.repository.ShippingFeeRepository;

@Service
@Transactional
public class ShippingFeeService {

	@Autowired
	private ShippingFeeRepository shippingFeeRepository;

	/**
	 * 送料データを全件表示します。
	 * 
	 * @return
	 */
	public List<ShippingFee> showAllShippingFee() {
		return shippingFeeRepository.findAll();
	}
}
