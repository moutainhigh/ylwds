package com.hailian.ylwmall;

import com.hailian.ylwmall.common.Constants;
import com.hailian.ylwmall.service.NewBeeMallOrderService;
import com.hailian.ylwmall.util.PageQueryUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {

    @Autowired
    NewBeeMallOrderService service;

    @Test
    public void contextLoads() {
        Map<String,Object> params = new HashMap<>();
        params.put("userId", 1111);
        if (StringUtils.isEmpty(params.get("page"))) {
            params.put("page", 1);
        }
        params.put("limit", Constants.ORDER_SEARCH_PAGE_LIMIT);
        PageQueryUtil queryUtil = new PageQueryUtil(params);
        service.getMyOrdersForSupplier(queryUtil);
        System.out.println("");
    }
}
