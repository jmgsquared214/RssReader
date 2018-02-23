package com.nerdydirtyit.demo.rssreader;

import com.nerdydirtyit.demo.rssreader.client.RssReaderTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class RssReaderSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for RssReader");
    suite.addTestSuite(RssReaderTest.class);
    return suite;
  }
}
