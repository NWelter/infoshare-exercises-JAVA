package chapter9udemy.data_structure.implements_interface_iterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//for iterate list in own class we can implement interface Iterable
public class UrlLibrary implements Iterable<String> {


    private List<String> urls = new LinkedList<>();

    public UrlLibrary() {
        urls.add("https://infoshareacademy.com");
        urls.add("http://www.up.lublin.pl");
        urls.add("https://www.caveofprogramming.com");
        urls.add("https://bbc.co.uk");
    }

    //    @Override
//    public Iterator<String> iterator() {
//
//        //method return an object Iterator (it has own method like .next(), hasNext() and remove()
//        //we can create inner private class Iterator and override this Iterator's methods (see at the top)
//        return urls.iterator();
//    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }


    private class UrlIterator implements Iterator<String> {


        // The goal is to retrieved number of signs of HTML from url address stored in own UrlLibrary

        private int index = 0;

        @Override
        public boolean hasNext() {

            //compare number of items in urls' list with index (0) and return T or F
            return index < urls.size();
        }

        @Override
        public String next() {
            //we must parsing own objects to strings thanks class URL (java.net):
            //when we use this class, we must catch MalformedURLException and IOException from BufferReader
            //we must create also StringBuilder

            StringBuilder stringBuilder = new StringBuilder();
            try {
                URL url = new URL(urls.get(index));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = null;

                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                }
                bufferedReader.close();

            } catch (Exception e) {//catch MalformedURLException and IOException
                e.printStackTrace();

            }

            index++;
            return stringBuilder.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);

        }
    }
}
