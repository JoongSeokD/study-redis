package me.ljseokd.studyredis;

import me.ljseokd.studyredis.account.Account;
import me.ljseokd.studyredis.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisRunner implements ApplicationRunner {

//    @Autowired
//    StringRedisTemplate redisTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
//        opsForValue.set("name", "Lee Joong Seok");
//        opsForValue.set("email", "ljseokd@gmail.com");

        Account account = new Account();
        account.setEmail("ljseokd@gmail.com");
        account.setName("Lee Joong Seok");
        accountRepository.save(account);

    }
}
