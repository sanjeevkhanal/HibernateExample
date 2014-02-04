package com.sanjeev.stock.bo;

import com.sanjeev.stock.model.Stock;
 
public interface StockBo {
 
	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);
}