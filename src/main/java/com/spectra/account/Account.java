package com.spectra.account;

import com.spectra.service.work.AdminWorkService;
import com.spectra.service.work.AgentWorkService;
import com.spectra.service.work.IWorkService;
import com.spectra.service.work.ManagerWorkService;

public class Account
{
    String roleId;
    protected IWorkService workService;
    
    public Account(String roleId)
    {
        if ("AGENT".equals(roleId))
        {
            setWork(new AgentWorkService());
        }
        else if ("MANAGER".equals(roleId))
        {
            setWork(new ManagerWorkService());
        }
        else if ("ADMIN".equals(roleId))
        {
            setWork(new AdminWorkService());
        }
    }

    public void setWork(IWorkService ws)
    {
        workService = ws;
    }
    
    public void accountWork()
    {
        workService.work();
    }
}
