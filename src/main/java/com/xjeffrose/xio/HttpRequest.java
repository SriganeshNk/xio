package com.xjeffrose.xio;

import java.util.*;
import java.util.logging.*;

import com.xjeffrose.log.*;

class HttpRequest {
  private static final Logger log = Log.getLogger(HttpRequest.class.getName());

  public int http_version_major = 0;
  public int http_version_minor = 0;
  public Method method = new Method();
  public Uri uri = new Uri();
  public Headers headers = new Headers();

  private String methodString = new String();
  private String uriString = new String();
  private Deque<Header> header_list = new ArrayDeque<Header>();
  private String regex = "\\s*\\bnull\\b\\s*";


  class Method {
    public void push_back(String in) {
      methodString += in;
      methodString = methodString.replaceAll(regex, "");
      /* log.info(methodString); */
    }
  }

  class Uri {
    public void push_back(String in) {
      uriString += in;
      uriString = uriString.replaceAll(regex, "");
      /* log.info(uriString); */
    }
  }

  class Header {
    public String name = new String();
    public String value = new String();
  }

  class Headers {
    private boolean headers_empty = true;

    public boolean empty() {
      return header_list.size() == 0;
    }

    public void push_back() {
      header_list.addLast(new Header());
    }

    public void push_back_name(String name) {
      header_list.getLast().name += name;
    }

    public void push_back_value(String value) {
      header_list.getLast().value += value;
      /* log.info( header_list.getLast().name + " : " + header_list.getLast().value); */
    }

    public void back() {
    }
  }

}