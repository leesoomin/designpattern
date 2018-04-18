package com.spectra.service.work;

public class ManagerWorkService implements IWorkService
{
    @Override
    public Boolean work()
    {
        AgentWorkService agt = new AgentWorkService();
        agt.work();
        
        System.out.println("최대 대기 상담수를 조절하는 행위를 한다.");
        return true;
    }
}
