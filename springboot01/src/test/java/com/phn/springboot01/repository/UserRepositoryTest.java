package com.phn.springboot01.repository;

import com.phn.springboot01.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;


/**
 * @author Penghenan
 * @create 2019-12-17 11:54:35
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Resource
    private BookRepository bookRepository;

    @Test
    public void findAll() {
        List<Book> all = bookRepository.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void findBookByBooknameOrBookbrief() {
        List<Book> book = bookRepository.findBookByBooknameOrBookbrief(null, "玄幻");
        book.forEach(System.out::println);
    }

    @Test
    public void findAllPage(){
        int page = 1;//页码
        int zise = 5;//每页显示的数据条数
        //排序策略  （根据其中一个字段）
        Sort sort = new Sort(Sort.Direction.DESC,"bookid");
        Pageable pageable = PageRequest.of(page,zise,sort);
        Page<Book> all = bookRepository.findAll(pageable);
        all.forEach(System.out::println);
    }




}