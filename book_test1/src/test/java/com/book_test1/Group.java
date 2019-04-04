package com.book_test1;

public class Group {
    private String groupfooter;
    private String groupheader;
    private String groupname;

    public Group setGroupfooter(String groupfooter) {
        this.groupfooter = groupfooter;
        return this;
    }

    public Group setGroupheader(String groupheader) {
        this.groupheader = groupheader;
        return this;
    }

    public Group setGroupname(String groupname) {
        this.groupname = groupname;
        return this;
    }

    public String getGroupfooter() {
        return groupfooter;
    }

    public String getGroupheader() {
        return groupheader;
    }

    public String getGroupname() {
        return groupname;
    }
}
