<<<<<<< HEAD
package cn.piao888.cg.thrift;

import cn.piao888.ProcessorDTO;
import cn.piao888.Proctocol;
import cn.piao888.cg.DTO.OrgService;
import cn.piao888.cg.service.OrgDemo;

public class ProessceService implements Proctocol {

    @Override
    public ProcessorDTO registerProcessor() {
        ProcessorDTO processorDTO=new ProcessorDTO();
        processorDTO.setProcessorName("org");
        processorDTO.setProcessor(new OrgService.Processor(new OrgDemo()));
        System.out.println("hello world!");
        return processorDTO;
    }
}
=======
package cn.piao888.cg.thrift;

import cn.piao888.ProcessorDTO;
import cn.piao888.Proctocol;
import cn.piao888.cg.DTO.OrgService;
import cn.piao888.cg.service.MainPlanServiceImpl;
import cn.piao888.cg.service.OrgDemo;
import cn.piao888.cg.thriftAPI.MainPlanService;

import java.util.ArrayList;
import java.util.List;

public class ProessceService implements Proctocol {

    @Override
    public List<ProcessorDTO> registerProcessor() {
        List<ProcessorDTO> processorDTOS=new ArrayList<>();
        ProcessorDTO processorDTO=new ProcessorDTO();
        processorDTO.setProcessorName("org");
        processorDTO.setProcessor(new OrgService.Processor(new OrgDemo()));
        System.out.println("hello world3!");
        processorDTOS.add(processorDTO);
        ProcessorDTO processorDTO1=new ProcessorDTO();
        processorDTO1.setProcessorName("main");
        processorDTO1.setProcessor(new MainPlanService.Processor<>(new MainPlanServiceImpl()));
        processorDTOS.add(processorDTO1);
        return processorDTOS;
    }
}
>>>>>>> d9fed244bc331bfdb9fbdb83eefa515d68770e37
