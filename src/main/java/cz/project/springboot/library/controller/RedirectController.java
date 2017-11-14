package cz.project.springboot.library.controller;

import cz.project.springboot.library.model.Author;
import cz.project.springboot.library.model.Book;
import cz.project.springboot.library.repository.AuthorRepository;
import cz.project.springboot.library.repository.BookRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Log
public class RedirectController {

//    @Autowired
//    private AuthorRepository authorRepository;
//    @Autowired
//    private BookRepository bookRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse response) {

//        List<Author> authorList = authorRepository.findAll();
//        List<Book> bookLiat=bookRepository.findAll();

        // перенаправление на страницу индекс
        return "redirect:" + request.getRequestURL().append("/index.xhtml").toString();
    }

}
