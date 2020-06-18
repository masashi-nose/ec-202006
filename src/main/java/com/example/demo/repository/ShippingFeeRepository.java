package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ShippingFee;

@Repository
public interface ShippingFeeRepository extends JpaRepository<ShippingFee, Integer> {

	/**
	 * 送料データを全件検索します.
	 *
	 */
	List<ShippingFee> findAll();
}
