package com.codewithmosh.iterator;

public class BrowseHistory {
    private String[] urls = new String[10]; // should be another data structure
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator {

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.length;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
