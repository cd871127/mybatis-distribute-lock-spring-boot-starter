package io.github.cd871127.starter.distributelock.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DistributeLockMapper {

    boolean lock(String lockName);


    class DistributeLockMapperSqlProvider {

    }
}
