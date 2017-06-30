package com.laonong.member.service;

import com.laonong.member.model.MemberUser;

import java.util.List;

/**
 * Created by wb-scg178938 on 2017/6/30.
 */
public interface MemberUserService {
    public List<MemberUser> getAll(MemberUser memberUser);

    public MemberUser getById(Long id);

    public MemberUser save(MemberUser memberUser);

    public Integer update(MemberUser memberUser);

    public Integer delete(Long id);

}
