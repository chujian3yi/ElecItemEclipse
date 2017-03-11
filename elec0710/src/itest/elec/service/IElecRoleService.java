package itest.elec.service;

import java.util.List;

import itest.elec.domain.ElecPopedom;
import itest.elec.domain.ElecRole;

public interface IElecRoleService {
	public static final String SERVICE_NAME = "itest.elec.service.impl.ElecRoleServiceImpl";

	List<ElecRole> findRoleList();

	List<ElecPopedom> findPopedomList();

	List<ElecPopedom> findPopedomListByRoleID(String roleID);

	List<itest.elec.domain.ElecUser> findUserListByUserID(String roleID);

	void saveRole(ElecPopedom elecPopedom);


}
