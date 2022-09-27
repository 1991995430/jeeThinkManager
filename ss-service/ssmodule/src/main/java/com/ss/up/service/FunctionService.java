package com.ss.up.service;

import com.ss.up.enums.AddressE;
import com.ss.up.model.ResExt;
import com.ss.up.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

@Service
public class FunctionService {
    private static final Logger log = LoggerFactory.getLogger(FunctionService.class);

    private Map<String, BiFunction<ResExt, User, Boolean>> sourceMap = new HashMap<>();


    @PostConstruct
    private void dispatcher() {
        sourceMap.put(AddressE.HF.getName(), this::hf);
        sourceMap.put(AddressE.BB.getName(), this::bb);
        sourceMap.put(AddressE.WH.getName(), this::other);
    }

    public void setRewardResult(ResExt resExt, User user) {
        BiFunction<ResExt, User, Boolean> result = sourceMap.get(user.getAddress());
        if (null != result) {
            result.apply(resExt, user);
        }
    }

    private Boolean hf(ResExt resExt, User user) {
        resExt.setResName(user.getName());
        return Boolean.TRUE;
    }

    private Boolean bb(ResExt resExt, User user) {
        resExt.setResName(user.getCity());
        return Boolean.TRUE;
    }

    private Boolean other(ResExt resExt, User user) {
        resExt.setResName(user.getAddress());
        return Boolean.TRUE;
    }

}