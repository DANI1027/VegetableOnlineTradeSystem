package com.czy.dao;

import com.czy.domain.VegetableInfo;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by hu on 2017/3/29.
 */

@Transactional
public interface VegetableDao extends CrudRepository<VegetableInfo, Long> {

}
