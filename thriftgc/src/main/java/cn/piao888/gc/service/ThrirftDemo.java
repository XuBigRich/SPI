package cn.piao888.gc.service;

import cn.piao888.gc.DTO.UserInfo;
import cn.piao888.gc.DTO.UserService;
import org.apache.thrift.TException;

import java.util.ArrayList;
import java.util.List;

public class ThrirftDemo implements UserService.Iface {

    public List<UserInfo> getUserByName(String username) throws TException {
        List<UserInfo> userInfo= new ArrayList<UserInfo>();
        for(int i=0;i<50;i++){
            UserInfo a=new UserInfo();
            a.setEmail(84711866+i+"@qq.com");
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
