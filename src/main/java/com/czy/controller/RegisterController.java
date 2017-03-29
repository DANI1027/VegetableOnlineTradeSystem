package com.czy.controller;

import com.alibaba.fastjson.JSONObject;
import com.czy.dao.UserInfoDao;
import com.czy.domain.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hu on 2017/3/29.
 */
@RestController
public class RegisterController {
    final static Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    private UserInfoDao userInfoDao;

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public String register(@RequestBody UserInfo userInfo) {
        JSONObject jsonObject = new JSONObject();

        UserInfo userInfoInSQL = userInfoDao.findByMobilePhoneNumber(userInfo.getMobilePhoneNumber());
        if (userInfoInSQL == null) {
            try {
                userInfoDao.save(userInfo);
                jsonObject.put("result", true);
                jsonObject.put("reason", "注册成功");
            } catch (Exception e) {
                jsonObject.put("result", false);
                jsonObject.put("reason", "手机号码已经注册");
            }
        } else {
            logger.info("手机号码已经注册");
            jsonObject.put("result", false);
            jsonObject.put("reason", "手机号码已经注册");
        }
        return jsonObject.toString();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String login(@RequestBody UserInfo userInfo) {
        JSONObject jsonObject = new JSONObject();
        UserInfo userInfoInSQL;
        if (userInfo.getMobilePhoneNumber() != null && userInfo.getMobilePhoneNumber().length() > 0) {
            // 使用手机号码登录
            userInfoInSQL = userInfoDao.findByMobilePhoneNumber(userInfo.getMobilePhoneNumber());
        } else {
            // 使用用户名登录
            userInfoInSQL = userInfoDao.findByUsername(userInfo.getUsername());
        }
        if (userInfoInSQL != null) {
            if (userInfo.getPassword().equals(userInfoInSQL.getPassword())) {
                jsonObject.put("result", true);
                jsonObject.put("reason", "登录成功");
            } else {
                jsonObject.put("result", false);
                jsonObject.put("reason", "登录失败");
            }
        }
        return jsonObject.toString();
    }
}