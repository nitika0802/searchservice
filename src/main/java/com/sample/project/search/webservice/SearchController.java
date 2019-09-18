package com.sample.project.search.webservice;

import java.io.PrintWriter;
import java.util.logging.Logger;

import com.sample.project.search.searchtool.SearchServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.*;

@Controller("searchController")
class SearchController {

    @RequestMapping(value = "/v1", method = RequestMethod.GET)
    void searchTerm(
        HttpServletResponse response,
@RequestParam(value="searchTerm",required = true) String searchTerm) throws Exception
    {
        PrintWriter out =response.getWriter();
        response.setContentType("application/json;charset=UTF-8");
if(null == searchTerm){
        System.out.println("Search Term is null. Please provide a valid search term");
        out.write("Invalid search Term");
}
else {
    out.write(SearchServiceImpl.getDisplayViewJson(searchTerm));
}
    }

}
