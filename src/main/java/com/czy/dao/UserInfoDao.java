package com.czy.dao;

import com.czy.domain.UserInfo;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by hu on 2017/3/29.
 */
@Transactional
public interface UserInfoDao extends CrudRepository<UserInfo, Long> {
    public UserInfo findByMobilePhoneNumber(String mobilePhoneNumber);

    public UserInfo findByUsername(String username);
}