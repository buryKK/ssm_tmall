package com.bury.dao.impl;

import org.springframework.stereotype.Repository;

import com.bury.dao.PropertyDao;
import com.bury.entity.Property;
@Repository("propertyDao")
public class PropertyDaoImpl extends BaseDaoImpl<Property> implements PropertyDao{

}
