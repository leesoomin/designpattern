package com.spectra.service.work;

public class AgentWorkService implements IWorkService
{
    @Override
    public Boolean work()
    {
        System.out.println("최대 동시 상담수를 조절하는 행위를 한다.");
        return true;
    }
}
