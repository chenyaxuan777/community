package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.LoginTicketMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.LoginTicket;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.PriorityQueue;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
class CommunityApplicationTests {

    @Autowired
    private MailClient mailClient;
    @Autowired
    LoginTicketMapper loginTicketMapper;

    @Test
    void contextLoads() {
        mailClient.sendMail("447122899@qq.com","TEST","welcome");
    }

    @Test
    public void ticketTest() {
        LoginTicket loginTicket = new LoginTicket();
        loginTicket.setId(101);
        loginTicket.setTicket("abc");
        loginTicket.setStatus(0);
        loginTicket.setExpired(new Date(System.currentTimeMillis() + 1000 * 60 * 10));
//        loginTicketMapper.insertLoginTicket(loginTicket);
        LoginTicket loginTicket1 = loginTicketMapper.selectByTicket("abc");
        System.out.println(loginTicket1);

    }


}
