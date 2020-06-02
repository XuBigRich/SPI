package cn.piao888.cg.service;

import cn.piao888.cg.DTO.OrgService;
import cn.piao888.cg.DTO.UserInfo;
import org.apache.thrift.TException;

import java.util.ArrayList;
import java.util.List;

public class OrgDemo implements OrgService.Iface {
    public List<UserInfo> getUserByName(String username) throws TException {
        List<UserInfo> userInfo= new ArrayList<UserInfo>();
        for(int i=0;i<50;i++){
            UserInfo a=new UserInfo();
            a.setEmail(84711866+i+"@163.com");
            a.setId(i);
            a.setEmailIsSet(true);
            a.setRealName(username+i);
            userInfo.add(a);
        }
        return userInfo;
    }

    public List<UserInfo> getUserByNameWait(String username) throws TException {
        List<UserInfo> userInfo= new ArrayList<UserInfo>();
//            Thread.sleep(500);
        return userInfo;
    }
}
