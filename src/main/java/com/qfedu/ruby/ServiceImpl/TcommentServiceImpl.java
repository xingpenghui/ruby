package com.qfedu.ruby.ServiceImpl;

import com.qfedu.ruby.dao.TcommentMapper;
import com.qfedu.ruby.service.TcommentService;
import com.qfedu.ruby.vo.Vcomment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TcommentServiceImpl implements TcommentService {

    @Autowired
    private TcommentMapper cm;
    @Override
    public List<Vcomment> selectBySid(Integer sid) {
        return cm.selectBySid(sid);
    }
}
