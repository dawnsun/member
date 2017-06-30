package com.laonong.member.service.impl;

import com.github.pagehelper.PageHelper;
import com.laonong.member.mapper.MemberUserMapper;
import com.laonong.member.model.MemberUser;
import com.laonong.member.service.MemberUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wb-scg178938 on 2017/6/30.
 */
@Service
public class MemberUserServiceImpl implements MemberUserService {
    @Autowired
    private MemberUserMapper memberUserMapper;

    @Override
    public List<MemberUser> getAll(MemberUser memberUser) {
        if (memberUser.getPage() != null && memberUser.getRows() != null) {
            PageHelper.startPage(memberUser.getPage(), memberUser.getRows());
        }
        return memberUserMapper.selectAll();
    }

    @Override
    public MemberUser getById(Long id) {
        return memberUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public MemberUser save(MemberUser memberUser) {
        memberUserMapper.insert(memberUser);
        return memberUser;
    }

    @Override
    public Integer update(MemberUser memberUser) {
        return memberUserMapper.updateByPrimaryKey(memberUser);
    }

    @Override
    public Integer delete(Long id) {
        return memberUserMapper.deleteByPrimaryKey(id);
    }
}
