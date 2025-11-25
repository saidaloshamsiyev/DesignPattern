package org.example.designpattern.iterator;


/**
 * Coustomer collection
 */
public class NameCollection implements Collection<String> {
    public String[] items = {"Bob", "Tom"};


    @Override
    public Iterator<String> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < items.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return items[current++];
            }
            return null;
        }
    }
}
