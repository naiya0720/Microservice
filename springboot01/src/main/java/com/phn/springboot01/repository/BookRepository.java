package com.phn.springboot01.repository;

import com.phn.springboot01.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Penghenan
 * @create 2019-12-17 11:42:30
 */
public interface BookRepository extends JpaRepository<Book,Integer> {

   /**
    *   查询所有
    * @return
    */
   List<Book> findAll();

   /**
    *    条件查询  (根据书本名字或备注查询)
    * @param bookname  书本名字
    * @param bookbrief  （备注或类型）
    * @return
    */
   List<Book> findBookByBooknameOrBookbrief(String bookname,String bookbrief);

   /**
    *   分页查询
    * @param pageable  支持分页的条件（内容）
    * @return
    */
   Page<Book> findAll(Pageable pageable);


}
