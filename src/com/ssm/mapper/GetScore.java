package com.ssm.mapper;

import com.ssm.main.pojo.ScoreResult;
import org.apache.ibatis.annotations.Param;

public interface GetScore {
  ScoreResult getScore(@Param("username") long username, @Param("term") String term ,@Param("nom") int nom);

    double getAvg(@Param("username") long username,@Param("term") String term);
}
