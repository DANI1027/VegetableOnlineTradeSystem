package com.czy.controller;

import com.alibaba.fastjson.JSONObject;
import com.czy.dao.VegetableDao;
import com.czy.domain.VegetableInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hu on 2017/3/29.
 */

@RestController
public class VegetableInfoController {
    private final Logger logger = LoggerFactory.getLogger(VegetableInfoController.class);

    @Autowired
    private VegetableDao vegetableDao;

    @RequestMapping("/vegetables")
    public List<VegetableInfo> getAllVegetables() {
        List<VegetableInfo> vegetableInfos = new ArrayList<>();
        vegetableDao.findAll().forEach(vegetableInfos::add);
        return vegetableInfos;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addVegetable")
    public String addVegetable(@RequestBody VegetableInfo vegetableInfo) {
        JSONObject jsonObject = new JSONObject();
        try {
            vegetableDao.save(vegetableInfo);
            jsonObject.put("result", true);
            jsonObject.put("reason", "添加成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            jsonObject.put("result", false);
            jsonObject.put("reason", "添加失败");
        }
        return jsonObject.toString();
    }


}
