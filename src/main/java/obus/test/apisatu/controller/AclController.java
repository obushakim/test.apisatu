package obus.test.apisatu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import obus.test.apisatu.entity.Acl;
import obus.test.apisatu.service.AclService;

@RestController
public class AclController {
	@Autowired
	@Qualifier("aclService")
	private AclService aclService;

	@GetMapping("/api/getacl/{id}")
	public Acl getAclById(@PathVariable(value = "id") int aclId) {
		return aclService.getAclById(aclId);
	}
}
