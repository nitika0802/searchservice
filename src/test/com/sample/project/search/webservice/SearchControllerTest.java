package com.sample.project.search.webservice;

import com.sample.project.search.configuration.ReadProperties;
import com.sample.project.search.util.SearchUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SearchControllerTest {

    int maxFetchSize = 0;
    List<String> properties = null;

    @Before
    public void setUp() throws Exception {
        properties = new ReadProperties().getProperties();
        maxFetchSize = Integer.parseInt(properties.get(0));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void searchTerm() throws Exception {
        assert  !(SearchUtil.getResponse("cloud", maxFetchSize,properties.get(1)).equals(null));
        assert !(SearchUtil.getResponse("cloud computing",maxFetchSize,properties.get(1)).equals(null));

    }
}