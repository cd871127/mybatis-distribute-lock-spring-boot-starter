package io.github.cd871127.starter.distributelock;

import io.github.cd871127.starter.distributelock.mapper.DistributeLockMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DistributeLock {

    @Resource
    private DistributeLockMapper distributeLockMapper;

    public boolean lock(String lockName) {
        try {
            distributeLockMapper.lock(lockName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean lock(String lockName, long expire) {
        return false;
    }

    public boolean unlock(String lockName) {
        return false;
    }

    public boolean unlock(String lockName, long expire) {
        return false;
    }

}
