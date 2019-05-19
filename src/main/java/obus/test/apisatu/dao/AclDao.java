package obus.test.apisatu.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import obus.test.apisatu.entity.Acl;

@Repository("aclDao")
public class AclDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Acl getAclById(int id) {
		return entityManager.find(Acl.class, id);
	}
}
