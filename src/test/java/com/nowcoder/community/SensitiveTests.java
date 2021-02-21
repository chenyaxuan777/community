package com.nowcoder.community;

import com.nowcoder.community.entity.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Chen
 * @create 2021-02-21 19:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTests {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void test() {
        String text = "你好赌博，这里可以赌博，可以嫖娼，可以吸毒，哈哈哈";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
