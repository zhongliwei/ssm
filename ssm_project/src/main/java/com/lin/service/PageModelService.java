package com.lin.service;

import com.lin.bean.Admin;
import com.lin.bean.PageModel;

public interface PageModelService {

	PageModel<Admin> findAdmins(int pageNo, int pageSize);
}
