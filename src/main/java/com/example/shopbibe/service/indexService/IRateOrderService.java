package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.Rate;
import com.example.shopbibe.model.RateProduct;

public interface IRateOrderService {
    RateProduct saveRateOrder (RateProduct rateProduct);
    Rate findRateByOrdersId(Long id);
}
