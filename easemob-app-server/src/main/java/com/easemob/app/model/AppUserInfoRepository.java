package com.easemob.app.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserInfoRepository extends JpaRepository<AppUserInfo, Long> {

    @Query(value = "select * from app_user_info_1 where user_account=?", nativeQuery = true)
    AppUserInfo findByUserAccount(String userAccount);

    @Query(value = "select * from app_user_info_1 where appkey = ? and user_account = ?", nativeQuery = true)
    AppUserInfo findByAppKeyAndUserAccount(String appKey, String userAccount);

    @Query(value = "select * from app_user_info_1 where appkey = ? and agora_uid=?", nativeQuery = true)
    AppUserInfo findByAgoraUid(String appkey, String agoraUid);
}