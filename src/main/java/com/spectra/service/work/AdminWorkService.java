package com.spectra.service.work;

public class AdminWorkService implements IWorkService
{
    @Override
    public Boolean work()
    {
        ManagerWorkService mng = new ManagerWorkService();
        mng.work();
        
        System.out.println("실시간으로 공지하는 행위를 한다.");
        return true;
    }
}
