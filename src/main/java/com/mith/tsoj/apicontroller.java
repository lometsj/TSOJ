package com.mith.tsoj;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mith.tsoj.ajax_struct.Login;
import com.mith.tsoj.entity.ChallengeEntity;
import com.mith.tsoj.repo.ChallengeRepo;
import com.mith.tsoj.repo.UserRepo;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class apicontroller {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ChallengeRepo challengeRepo;

    @RequestMapping("/api/login")
    public Map<String, String> login(@RequestBody Login login, HttpServletRequest httpServletRequest){
        Map<String, String> ret = new HashMap<>();
        String storeSalt = userRepo.findByUsrname(login.getName()).getSalt();
        if(BCrypt.checkpw(login.getPwd(),storeSalt)){
            httpServletRequest.getSession().setAttribute("user",login.getName());
            ret.put("res","success");
        }
        return ret;
    }

    @RequestMapping("/api/logout")
    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        httpServletRequest.getSession().removeAttribute("user");
        httpServletResponse.sendRedirect("/");
    }

    @RequestMapping(value = "/api/challenlist")
    public List< ChallengeEntity > challenlist(){
        return challengeRepo.findAll();
    }

}
