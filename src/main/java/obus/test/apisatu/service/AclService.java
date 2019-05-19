package obus.test.apisatu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import obus.test.apisatu.dao.AclDao;
import obus.test.apisatu.entity.Acl;

@Service("aclService")
public class AclService {
	@Autowired
	@Qualifier("aclDao")
	private AclDao aclDao;

	@Transactional
	public Acl getAclById(int id) {
		return aclDao.getAclById(id);
	}
}
